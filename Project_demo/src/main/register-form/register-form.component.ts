import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder } from '@angular/forms'

@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.scss']
})
export class RegisterFormComponent implements OnInit {

  registerForm: FormGroup;
  constructor(private formbuilder: FormBuilder) {
    this.registerForm = this.formbuilder.group({
      firstName: [''],
      lastName: [''],
      age: [''],
      userName: [''],
      password: ['']
    });
  }

  ngOnInit(): void {
  }

  submit() {
    console.log("form date"+this.registerForm.value);
  }

}

export class Register {
  constructor(public firstName: string,
    public lastName: string,
    public age: string,
    public userName: string,
    public password: string) {

  }
}
