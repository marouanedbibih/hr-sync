import { IUser } from "../modules/user/user.model";

export interface ILoginREQ {
  username: string;
  password: string;
}

export interface ILoginRES {
  token: string;
  user: IUser;
}
