export interface IUser {
  id: number;
  username: string;
  password?: string | null;
  role: Role;
  createdAt: Date;
  updatedAt: Date;
}

enum Role {
  ADMIN = 'ADMIN',
  USER = 'USER',
  MANAGER = 'MANAGER',
}
