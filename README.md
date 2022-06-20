# Triple Backend HomeWork

트리플 백엔드 과제입니다.

## Compatibility

| -           | -                     |
|-------------|-----------------------|
| Spring boot | 2.6.7                 |
| Java        | 11                    |
| Build tool  | maven                 |
| Database    | mysql:8.0.29 (latest) |
| Docker      | 20.10.10              |

## Installation

- Docker 최신 버전이 설치된 가정하에 실행합니다.
- Mysql 포트는 3306을 사용합니다. (쓰고 있다면 잠시 중지)
1. tripleHomework 디렉토리로 이동합니다.
2. start.sh 을 실행합니다.
```
$sh start.sh
```
3. tripleHomework 스프링 프로젝트의 ClubApplication App을 실행합니다. (Default Profile)
4. [http://localhost:1111/](http://localhost:1111/) 로 api 통신을 합니다.


## SQL QUERY

```
CREATE TABLE `POINT_LOG` (
                             `SEQ` bigint NOT NULL AUTO_INCREMENT,
                             `CREATE_DT` datetime NOT NULL,
                             `REASON` varchar(255) DEFAULT NULL,
                             `REVIEW_ID` varchar(36)  DEFAULT NULL,
                             `TOTAL_POINT` bigint DEFAULT NULL,
                             `USER_ID` varchar(36)  DEFAULT NULL,
                             PRIMARY KEY (`SEQ`)
) ENGINE=InnoDB AUTO_INCREMENT=136 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `REVIEW` (
                          `REVIEW_ID` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                          `CREATE_DT` datetime NOT NULL,
                          `UPDATE_DT` datetime NOT NULL,
                          `ATTACHED_PHOTO_IDS` varchar(1000)  DEFAULT NULL,
                          `CONTENT` varchar(1000)  DEFAULT NULL,
                          `PLACE_ID` varchar(36)  DEFAULT NULL,
                          `USER_ID` varchar(36)  DEFAULT NULL,
                          PRIMARY KEY (`REVIEW_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```
