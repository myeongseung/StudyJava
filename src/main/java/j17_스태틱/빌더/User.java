package j17_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private String username;
    private String password;
    private String email;
    private String name;

    public static class UserBuilder {
        private String username;
        private String password;
        private String email;
        private String name;

        public UserBuilder username(String username) { //UserBuilder 를 타입으로 줘서 이를 리턴
            this.username = username;
            return this;
        }

        public UserBuilder password(String password) { //UserBuilder 를 타입으로 줘서 이를 리턴
            this.password = password;
            return this;
        }

        public UserBuilder email(String email) { //UserBuilder 를 타입으로 줘서 이를 리턴
            this.email = email;
            return this;
        }

        public UserBuilder name(String name) { //UserBuilder 를 타입으로 줘서 이를 리턴
            this.name = name;
            return this;
        }

        public User build() { //User 타입의 build 메소드
            return new User(username, password, email, name);
        }
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }
}