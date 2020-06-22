# ManagerSys
基于ssm 和 adminlte的后台管理系统，包含后台管理系统及其接口，以及一些给移动端使用的api接口

后台系统主要功能：人员管理（权限管理）、审核视频、文章、被举报用户等等，详细功能查看接口文档。



-----------------------------------



一、修改记录





|   时间    | 版本 |               内容               |
| :-------: | :--: | :------------------------------: |
| 2019.8.16 |      |               创建               |
| 2019.9.6  |      | 最新视频展示、类型列表、新建类型 |
|           |      |                                  |



## 二、接口列表



### #一、管理员端（web端）

#### 1.权限管理

##### 1.1 管理员登陆

**简要描述**

* 管理员登录

**请求URL**

* http://xxxx/tiangong/admin/login

**请求方式**

* GET

**参数**

| 参数名   | 必选 | 类型   | 说明         |
| -------- | ---- | ------ | ------------ |
| account  | 是   | String | 管理员账户   |
| password | 是   | String | 密码返回示例 |

**返回示例**

```json
{
	"code":200
	"data" :{
	"id" : 10000000000,
	"level":1
	}
}
```

**返回参数说明**

| 参数  | 类型 | 说明       |
| ----- | ---- | ---------- |
| id    | int  | 管理员id   |
| level | int  | 管理员权限 |



##### 1.2 增加管理员账户

**简要描述**

- 增加管理员用户，仅超级管理员操作

**请求URL**

- http://xxxx/tiangong/admin/addAdmin

**请求方式**

- POST

**参数**

| 参数名   | 必选 | 类型   | 说明         |
| -------- | ---- | ------ | ------------ |
| account  | 是   | String | 管理员账户   |
| password | 是   | String | 密码返回示例 |
| level    | 是   | int    | 权限等级     |

注：0表示普通管理员，1表示超级管理员

**返回示例**

```json
{
	"code":200
}
```

**返回参数说明**

* 无



**错误代码**

* code=1，权限不足
* code=2，账号已存在



##### 1.3 删除管理员

**简要描述**

- 删除管理员，仅超级管理员操作

**请求URL**

- http://xxxx/tiangong/admin/deleteAdmin

**请求方式**

- DELETE

**参数**

| 参数名  | 必选 | 类型   | 说明               |
| ------- | ---- | ------ | ------------------ |
| account | 是   | String | 要删除的管理员账户 |

**返回示例**

```json
{
	"code":200
}
```

**返回参数说明**

- 无

**错误代码**

- code=1，权限不足



##### 1.4 查看管理员列表

**简要描述**

- 请求查看管理员列表

**请求URL**

- http://xxxx/tiangong/admin/getAdminList

**请求方式**

- GET

**参数**

* 无

**返回示例**

```json
{
	"code":200
	"data" :[
    {
	"id" : 10000000000,
    "account":"root",
	"level":1
	},{
    "id" :10000000001,
    "account":"ABC",
	"level":0
    }
	]
}
```

**返回参数说明**

| 参数    | 类型   | 说明       |
| ------- | ------ | ---------- |
| id      | int    | 管理员id   |
| account | String | 管理员账户 |
| level   | int    | 管理员权限 |



#### 2.公告管理

##### 2.1 查看公告列表

**简要描述**

- 查看公告列表

**请求URL**

- http://xxxx/tiangong/announce/getAnnounce

**请求方式**

- GET

**请求参数**

- 无

**返回示例**

```json
{
    "code":200,
    "data":[
        {
            "id":1,
            "title":"1",
            "sender_id":"10000000000",
            "content":"2333",
            "post_time":"2018-01-01 12:00:00"
        },
        {
            "id":2,
            "title":"2",
            "sender_id":"10000000000",
            "content":"233333",
            "post_time":"2019-01-010 00:23:22"
        }
    ]
}
```

**返回参数说明**

| 参数      | 类型   | 说明     |
| --------- | ------ | -------- |
| id        | i      | 公告id   |
| title     | String | 公告标题 |
| content   | String | 公告内容 |
| sender_id | int    | 发布人   |
| post_time | date   | 发布时间 |



##### 2.2 发布公告

**简要说明**

- 发布公告

**请求URL**

http://xxxx/tiangong/postAnnounce

**请求类型**

- POST

**请求参数**

| 参数名    | 必选 | 类型   | 说明     |
| --------- | ---- | ------ | -------- |
| title     | 是   | String | 标题     |
| content   | 是   | String | 内容     |
| sender_id | 是   | int    | 发布人id |

**返回示例**

```json
{ 
  "code":200
}
```

**返回参数说明**

- 无



##### 2.3删除公告

**简要描述**

- 删除公告

**请求URL**

- http://xxx/tiangong/deleteAnnounce

**请求类型**

- DELETE

**请求参数**

| 参数名 | 必选 | 类型 | 说明             |
| ------ | ---- | ---- | ---------------- |
| id     | 是   | int  | 需要删除的公告id |

**返回示例**

```
{
  "code":200
}
```

**返回参数说明**

- 无



##### 2.4 编辑公告

**简要描述**

- 编辑公告

**请求URL**

- http://xxxx/tiangong/modifyAnnounceList

**请求方式**

- PUT

**请求参数**

| 参数名    | 必选 | 类型   | 说明     |
| --------- | ---- | ------ | -------- |
| title     | 是   | String | 标题     |
| content   | 是   | String | 内容     |
| sender_id | 是   | int    | 发布人id |

**返回示例**

```json
{ 
  "code":200
}
```

**返回参数说明**

- 无



#### 3.审核管理

##### 3.1 查看视频

**简要描述**

* 查看视频内容

**请求URL**

* http://xxxx/tiangong/videoCheck/view

**请求方式**

- GET

**参数**

| 参数名 | 必选 | 类型 | 说明   |
| ------ | ---- | ---- | ------ |
| id     | 是   | int  | 视频id |

**返回示例**

```json
{
	"code":200
}

```

**返回参数**

* 无



##### 3.2 审核视频

**简要描述**

- 审核视频

**请求URL**

- http://xxxx/tiangong/check/videoAudit

**请求方式**

- PUT

**参数**

| 参数   | 类型 | 说明     |
| ------ | ---- | -------- |
| id     | int  | 视频id   |
| isPass | int  | 是否通过 |

注：0没通过，1通过。

**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

* 无



##### 3.3查看视频列表

**简要描述**

- 请求查看管理员列表

**请求URL**

- http://xxxx/tiangong/videoCheck/getList

**请求方式**

- GET

**参数**

- 无

**返回示例**

```json
{
	"code":200
	"data" :[
    {
	"id" : 10000000000,
    "name":"FFFFFF",
    "cover_url":"**********"，
    "video_url":"..........",
    "release_time":"2019-01-010 00:23:22",
	"des":"hahahaha"
	},{
	"id" : 10000000001,
    "name":"Happy",
    "cover_url":"**********"，
    "video_url":"..........",
    "release_time":"2019-01-010 00:23:22",
	"des":"abc"
    }
	]
}

```

**返回参数说明**

| 参数         | 类型   | 说明     |
| ------------ | ------ | -------- |
| id           | int    | 视频id   |
| name         | string | 名称     |
| cover_url    | string | 封面     |
| video_url    | string | 视频     |
| release_time | date   | 发布时间 |
| des          | string | 简介     |



##### 3.4 查看教程

**简要描述**

- 查看教程内容

**请求URL**

- http://xxxx/tiangong/courseCheck/view

**请求方式**

- GET

**参数**

| 参数名 | 必选 | 类型 | 说明   |
| ------ | ---- | ---- | ------ |
| id     | 是   | int  | 教程id |

**返回示例**

```json
{
	"code":200
}

```

**返回参数**

- 无



##### 3.5 审核视频

**简要描述**

- 审核教程

**请求URL**

- http://xxxx/tiangong/courseCheck/isPassAudit

**请求方式**

- PUT

**参数**

| 参数   | 类型 | 说明     |
| ------ | ---- | -------- |
| id     | int  | 教程id   |
| isPass | int  | 是否通过 |

**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无



##### 3.6查看教程列表

**简要描述**

- 请求查看管理员列表

**请求URL**

- http://xxxx/tiangong/courseCheck/getList

**请求方式**

- GET

**参数**

- 无

**返回示例**

```json
{
	"code":200
	"data" :[
    {
	"id" : 10000000000,
    "name":"FFFFFF",
    "cover_url":"**********"，
    "course_url":"..........",
    "release_time":"2019-01-010 00:23:22",
	"des":"hahahaha"
	},{
	"id" : 10000000001,
    "name":"Happy",
    "cover_url":"**********"，
    "course_url":"..........",
    "release_time":"2019-01-010 00:23:22",
	"des":"abc"
    }
	]
}

```

**返回参数说明**

| 参数         | 类型   | 说明     |
| ------------ | ------ | -------- |
| id           | int    | 教程id   |
| name         | string | 名称     |
| cover_url    | string | 封面     |
| course_url   | string | 教程     |
| release_time | date   | 发布时间 |
| des          | string | 简介     |



##### 3.7 查看文章

**简要描述**

- 查看文章

**请求URL**

- http://xxxx/tiangong/ArticleCheck/view

**请求方式**

- GET

**参数**

| 参数名 | 必选 | 类型 | 说明   |
| ------ | ---- | ---- | ------ |
| id     | 是   | int  | 文章id |

**返回示例**

```json
{
	"code":200,
}

```

**返回参数**

* 无



##### 3.8 审核文章

**简要描述**

- 审核文章

**请求URL**

- http://xxxx/tiangong/ArticleCheck/isPassAudit

**请求方式**

- PUT

**参数**

| 参数   | 类型 | 说明     |
| ------ | ---- | -------- |
| id     | int  | 文章id   |
| isPass | int  | 是否通过 |

**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无



##### 3.9查看文章列表

**简要描述**

- 请求查看文章列表

**请求URL**

- http://xxxx/tiangong/ArticleCheck/getList

**请求方式**

- GET

**参数**

- 无

**返回示例**

```json
{
	"code":200
	"data" :[
    {
	"id" : 10000000000,
    "name":"sad",
    "content_url":"..........",
    "release_time":"2019-01-010 00:23:22",
	"des":"hahahaha"
	},{
	"id" : 10000000001,
    "name":"Happy",
    "content_url":"..........",
    "release_time":"2019-01-010 00:23:22",
	"des":"abc"
    }
	]
}

```

**返回参数说明**

| 参数         | 类型   | 说明     |
| ------------ | ------ | -------- |
| id           | int    | 教程id   |
| name         | string | 名称     |
| content_url  | string | 文章内容 |
| release_time | date   | 发布时间 |
| des          | string | 简介     |

##### 3.10 查看（被举报）评论

**简要描述**

- 查看（被举报）评论

**请求URL**

- http://xxxx/tiangong/commentsCheck/view

**请求方式**

- GET

**参数**

| 参数名 | 必选 | 类型 | 说明   |
| ------ | ---- | ---- | ------ |
| id     | 是   | int  | 评论id |

**返回示例**

```json
{
	"code":200,
}

```

**返回参数**

- 无



##### 3.11 审核（被举报）评论

**简要描述**

- 审核（被举报）评论

**请求URL**

- http://xxxx/tiangong/commentsCheck/isPassAudit

**请求方式**

- PUT

**参数**

| 参数   | 类型 | 说明     |
| ------ | ---- | -------- |
| id     | int  | 评论id   |
| isPass | int  | 是否通过 |

**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无



##### 3.12 查看（被举报）评论列表

**简要描述**

- 请求（被举报）评论列表

**请求URL**

- http://xxxx/tiangong/commentsCheck/getList

**请求方式**

- GET

**参数**

- 无

**返回示例**

```json
{
	"code":200
	"data" :[
    {
	"id" : 10000000000,
    "content":"..........",
	},{
	"id" : 10000000001,
    "content":"**...***",
    }
	]
}

```

**返回参数说明**

| 参数    | 类型   | 说明     |
| ------- | ------ | -------- |
| id      | int    | 评论id   |
| content | string | 评论内容 |



##### 3.13 查看被举报用户列表

**简要描述**

-  查看被举报用户列表

**请求URL**

- http://xxxx/tiangong/usersCheck/view

**请求方式**

- GET

**参数**

* 无

**返回示例**

```json
{
	"code":200,
    "data":[
        {
           "id":11111111111,
            "name":"user1",
            "count":5
        }，{
           "id":11111111110,
            "name":"user2",
            "count":0
        }
    ]
}

```

**返回参数**

| 参数  | 类型   | 说明             |
| ----- | ------ | ---------------- |
| id    | int    | 用户id           |
| name  | string | 用户名           |
| count | int    | 被举报的评论数量 |



##### 3.14封禁（被举报）用户评论权限

**简要描述**

- 封禁（被举报）用户评论权限

**请求URL**

- http://xxxx/tiangong/usersCheck/isPassAudit

**请求方式**

- PUT

**参数**

| 参数   | 类型 | 说明     |
| ------ | ---- | -------- |
| id     | int  | 用户id   |
| status | int  | 是否通过 |

注：status为1正常评论，0封禁评论

**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无





####  4. 词条管理

##### 4.1查看词条列表

**简要描述**

* 查看词条列表

**请求URL**

- http://xxxx/tiangong/Entries/List

**请求方式**

- GET

**参数**

- 无

**返回示例**

```json
{
	"code":200
	"data" :[
    {
	"id" : 10000000000,
    "name":"雕塑",
    "content_url":"..........",
    "time":"2019-01-010 00:23:22",
	"version":"1"，
    "user_id":"1234561111",
    "reason":"太短了"
	}，{
	"id": 10000000001，
    "name":"刺绣"，
    "content_url":".........."，
    "time":"2019-01-010 00:23:22",
	"version":"1"，
    "user_id":"1234561111",
    "reason":"太长了"
    }
	]
}

```

**返回参数说明**

| 参数        | 类型   | 说明     |
| ----------- | ------ | -------- |
| id          | int    | 百科id   |
| name        | string | 名称     |
| content_url | string | 词条内容 |
| time        | date   | 发布时间 |
| version     | int    | 版本号   |
| user_id     | int    | 修改者id |
| reason      | string | 修改原因 |



##### 4.2 删除词条

**简要描述**

- 删除词条

**请求URL**

- http://xxxx/tiangong/Entries/delete

**请求类型**

- DELETE

**请求参数**

| 参数名 | 必选 | 类型 | 说明             |
| ------ | ---- | ---- | ---------------- |
| id     | 是   | int  | 需要删除的百科id |

**返回示例**

```
{
  "code":200
}

```

**返回参数说明**

- 无



##### 4.3 回滚词条历史版本

**简要描述**

- 回滚词条历史版本

**请求URL**

- http://xxxx/tiangong/Entries/returnVersion

**请求类型**

- PUT

**请求参数**

| 参数名 | 必选 | 类型 | 说明         |
| ------ | ---- | ---- | ------------ |
| id     | 是   | int  | 回滚的版本id |

**返回示例**

```
{
  "code":200
}

```

**返回参数说明**

- 无



#### 5. 线下活动管理

##### 5.1线下活动列表

**简要描述**

- 查看线下活动列表

**请求URL**

- http://xxxx/tiangong/Activity/List

**请求类型**

- GET

**请求参数**

* 无

**返回示例**

```
{
  "code":200，
  "data":[
  {
  	"id":1,
  	"name":"文化博物馆一日游",
  	"time":"2019-01-010 10:23:22",
  	"des":"好玩呀",
  	"members_count":5
  },{
  	"id":2,
  	"name":"西湖",
  	"time":"2019-01-010 09:30:00",
  	"des":"Good",
  	"members_count":10  
  }
  ]
}

```

**返回参数说明**

| 参数名       | 类型   | 说明     |
| ------------ | ------ | -------- |
| id           | int    | 活动id   |
| name         | string | 活动名   |
| time         | date   | 开始时间 |
| des          | string | 简介     |
| member_count | int    | 参与人数 |



##### 5.2 删除线下活动

**简要描述**

- 删除线下活动

**请求URL**

- http://xxxx/tiangong/Activity/delete

**请求类型**

- DELETE

**请求参数**

| 参数名 | 必选 | 类型 | 说明             |
| ------ | ---- | ---- | ---------------- |
| id     | 是   | int  | 需要删除的活动id |



**返回示例**

```
{
  "code":200，
}

```

**返回参数**

* 无



#### #6.分析管理（未完成）

##### 6.1 获取当日教程流量

**简要描述**

- 获取当日教程流量

**请求URL**

- http://xxxx/tiangong/Analysis/Course

**请求类型**

- GET

**请求参数**

| 参数名 | 必选 | 类型 | 说明             |
| ------ | ---- | ---- | ---------------- |
| time   | 是   | date | 需要删除的活动id |



**返回示例**

```
{
  "code":200，
  "index":["类别一","类别二","类别三"]
  "data":{
 		"类别一":6546,
        "类别二":7896,
        "类别三":4821
  	}
}

```

**返回参数**

| 参数  | 说明         |
| ----- | ------------ |
| index | 类别索引数组 |
| data  | 流量数据数组 |



##### 6.2 获取当日视频流量

**简要描述**

- 获取当日视频流量

**请求URL**

- http://xxxx/tiangong/Analysis/Video

**请求类型**

- GET

**请求参数**

| 参数名 | 必选 | 类型 | 说明 |
| ------ | ---- | ---- | ---- |
| time   | 是   | date |      |



**返回示例**

```
{
  "code":200，
  "index":["类别一","类别二","类别三"]
  "data":{
 		"类别一":6546,
        "类别二":7896,
        "类别三":4821
  	}
}

```

**返回参数**

| 参数  | 说明         |
| ----- | ------------ |
| index | 类别索引数组 |
| data  | 流量数据数组 |



##### 6.3 获取当日文章流量

**简要描述**

- 获取当日文章流量

**请求URL**

- http://xxxx/tiangong/Analysis/Article

**请求类型**

- GET

**请求参数**

| 参数名 | 必选 | 类型 | 说明 |
| ------ | ---- | ---- | ---- |
| time   | 是   | date |      |



**返回示例**

```
{
  "code":200，
  "index":["类别一","类别二","类别三"]
  "data":{
 		"类别一":6546,
        "类别二":7896,
        "类别三":4821
  	}
}

```

**返回参数**

| 参数  | 说明         |
| ----- | ------------ |
| index | 类别索引数组 |
| data  | 流量数据数组 |





### 二、移动端

#### 1. 用户管理（完成）

##### 1.1 用户登录

**简要描述**

- 用户登录

**请求URL**

- https://xxxx/tiangong/user/login

**请求方式**

- GET

**参数**

| 参数名   | 必选 | 类型   | 说明       |
| :------- | :--- | :----- | :--------- |
| account  | 是   | String | 管理员账户 |
| password | 是   | String | 密码       |

**返回示例**



```
{
    "code":200
    "data" :{
    "id" : 10000000000
    }
}

```



**返回参数说明**

| 参数 | 类型 | 说明     |
| :--- | :--- | :------- |
| id   | int  | 管理员id |



##### 1.2用户注册

**简要描述**

- 用户注册

**请求URL**

- https://xxxx/tiangong/user/register

**请求方式**

- POST

**参数**

| 参数名   | 必选 | 类型   | 说明   |
| -------- | ---- | ------ | ------ |
| phone    | 是   | String | 电话   |
| password | 是   | String | 密码   |
| username | 是   | String | 用户名 |



**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无



**错误代码**

- code=1，电话已注册过账号
- code=2，用户名已存在



##### 1.3 上传个人资料

**简要描述**

- 上传个人资料

**请求URL**

- https://xxxx/tiangong/user/uploadUserInfo

**请求方式**

- PUT

**参数**

| 参数名     | 必选 | 类型    | 说明   |
| ---------- | ---- | ------- | ------ |
| id         | 是   | int     | 用户id |
| username   | 否   | String  | 用户名 |
| gender     | 否   | boolean | 性别   |
| province   | 否   | String  | 省     |
| city       | 否   | String  | 市     |
| phone      | 否   | String  | 电话   |
| avatar_url | 否   | String  | 头像   |
| e_mail     | 否   | String  | 邮箱   |



**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无





##### 1.4 认证成为匠人

**简要描述**

* 认证成为匠人

**请求URL**

- https://xxxx/tiangong/user/identifyArtist

**请求方式**

- POST

**参数**

| 参数名      | 必选 | 类型   | 说明     |
| ----------- | ---- | ------ | -------- |
| user_id     | 是   | String | 用户名   |
| content_url | 是   | String | 认证证明 |



**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无

##### 1.5 历史播放记录

**简要描述**

- 获取历史播放列表

**请求URL**

- https://xxxx/tiangong/user/history

**请求方式**

- GET

**参数**

| 参数名 | 必选 | 类型 | 说明   |
| ------ | ---- | ---- | ------ |
| id     | 是   | int  | 用户名 |



**返回示例**

```json
{
    "code": 200,
    "data": {
        "list": [
            {
                "item": {
                    "click_count": 0,
                    "comments_count": 0,
                    "content_url": "<!doctype html>\n<html lang=\"en\">\n\n<head>\n\t<title>HTTP Status 400 – Bad Request</title>\n\t<style type=\"text/css\">\n\t\th1 {\n\t\t\tfont-family: Tahoma, Arial, sans-serif;\n\t\t\tcolor: white;\n\t\t\tbackground-color: #525D76;\n\t\t\tfont-size: 22px;\n\t\t}\n\n\t\th2 {\n\t\t\tfont-family: Tahoma, Arial, sans-serif;\n\t\t\tcolor: white;\n\t\t\tbackground-color: #525D76;\n\t\t\tfont-size: 16px;\n\t\t}\n\n\t\th3 {\n\t\t\tfont-family: Tahoma, Arial, sans-serif;\n\t\t\tcolor: white;\n\t\t\tbackground-color: #525D76;\n\t\t\tfont-size: 14px;\n\t\t}\n\n\t\tbody {\n\t\t\tfont-family: Tahoma, Arial, sans-serif;\n\t\t\tcolor: black;\n\t\t\tbackground-color: white;\n\t\t}\n\n\t\tb {\n\t\t\tfont-family: Tahoma, Arial, sans-serif;\n\t\t\tcolor: white;\n\t\t\tbackground-color: #525D76;\n\t\t}\n\n\t\tp {\n\t\t\tfont-family: Tahoma, Arial, sans-serif;\n\t\t\tbackground: white;\n\t\t\tcolor: black;\n\t\t\tfont-size: 12px;\n\t\t}\n\n\t\ta {\n\t\t\tcolor: black;\n\t\t}\n\n\t\ta.name {\n\t\t\tcolor: black;\n\t\t}\n\n\t\t.line {\n\t\t\theight: 1px;\n\t\t\tbackground-color: #525D76;\n\t\t\tborder: none;\n\t\t}\n\t</style>\n</head>\n\n<body>\n\t<h1>HTTP Status 400 – Bad Request</h1>\n\t<hr class=\"line\" />\n\t<p><b>Type</b> Status Report</p>\n\t<p><b>Message</b> Required String parameter &#39;text&#39; is not present</p>\n\t<p><b>Description</b> The server cannot or will not process the request due to something that is perceived to be a\n\t\tclient error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing).\n\t</p>\n\t<hr class=\"line\" />\n\t<h3>Apache Tomcat/8.5.28</h3>\n</body>\n\n</html>",
                    "cover_url": "http://localhost:8090/tiangong/share/cover/15666134103641.jpg",
                    "favor_count": 0,
                    "id": 1,
                    "isPass": false,
                    "ischeck": false,
                    "isdelete": false,
                    "like_count": 0,
                    "post_time": 1566695678000,
                    "share_count": 0,
                    "status": true,
                    "title": "标题",
                    "type_id": 1,
                    "user_id": 1
                },
                "user_id": 1,
                "item_id": 1,
                "isdelete": false,
                "type": 1,
                "browse_time": 1566740070000
            }
        ]
    },
    "msg": "处理成功！"
}

```

**返回参数说明**

* type 1 :文章 ；2：视频 3：教程



##### 1.6 举报用户

**请求方法**

* PUT

**请求url**

* https://xxxx/tiangong/user/report

**请求参数**

| 参数 | 必选 | 类型 | 说明   |
| ---- | ---- | ---- | ------ |
| id   | 是   | int  | 用户id |



#### 2.首页管理

##### 2.1 推荐图文展示

**简要描述**

* 推荐图文展示

**请求URL**

* https://xxxx/tiangong/homePage/recommendArticles

**请求方式**

* GET

**请求参数**

- 无



注：个性推荐(暂时不用id)

| 参数 | 必选 | 类型 | 说明   |
| ---- | ---- | ---- | ------ |
| id   | 是   | int  | 用户id |

**返回示例**

```json
{
    "code":200,
    "data"[
   			...
    ]
}

```



##### 2.1 最新视频展示

**请求URL**

- https://xxxx/tiangong/homePage/latestVideo

**请求方式**

- GET

**请求参数**

- 无

| 参数 | 必选 | 类型 | 说明               |
| ---- | ---- | ---- | ------------------ |
| page | 否   | int  | 访问页数 （默认1） |





##### #2.2 最新匠人展示（未完成)

**简要描述**

- 最新匠人展示

**请求URL**

- https://xxxx/tiangong/homePage/viewLatestArtist

**请求方式**

- GET

**请求参数**

* 无

**返回示例**

```json
{
    "code":200,
    "data"[
    	{
    		"entries_id":1,
    		"entries_url":"..........."
		}, {
    		"entries_id":2,
    		"entries_url":"..........."
		}, {
    		"entries_id":3,
    		"entries_url":"..........."
		}, {
    		"entries_id":4,
    		"entries_url":"..........."
		}, {
    		"entries_id":5,
    		"entries_url":"..........."
		}
    ]
}

```



**返回参数说明**

| 参数        | 类型   | 说明   |
| ----------- | ------ | ------ |
| entries_id  | int    | 匠人id |
| entries_url | string | 资源   |



##### #2.3 最新工艺品展示（未完成)

**简要描述**

- 最新工艺品展示

**请求URL**

- https://xxxx/tiangong/homePage/viewLatestCrafts

**请求方式**

- GET

**请求参数**

* 无

**返回示例**

```json
{
    "code":200,
    "data"[
    	{
    		"craft_id":1,
    		"craft_url":"..........."
		}, {
    		"craft_id":2,
    		"craft_url":"..........."
		}, {
    		"craft_id":3,
    		"craft_url":"..........."
		}, {
    		"craft_id":4,
    		"craft_url":"..........."
		},...
    ]
}

```



**返回参数说明**

| 参数      | 类型   | 说明       |
| --------- | ------ | ---------- |
| craft_id  | int    | 手工艺品id |
| craft_url | string | 资源       |



##### 2.4 查看公告

**简要描述**

- 推荐图文展示

**请求URL**

- https://xxxx/tiangong/announce/getAnnounce

**请求方式**

- GET

**请求参数**

* 无

**返回示例**



```json
{
    "code":200,
    "data"[
  		{
    		"id":123,
    		"content":"..........."，
    		"time":"2019-01-010 10:23:22",
    		"title":"这是公告"
		}
    ]
}

```



**返回参数说明**

| 参数    | 类型   | 说明     |
| ------- | ------ | -------- |
| id      | int    | 公告id   |
| content | string | 公告内容 |
| time    | date   | 发布时间 |
| title   | string | 标题     |



#### 3.展示模块

##### #3.1 查看匠人图文视频

**简要描述**

* 展示匠人相关的图文视频

**请求URL**

* https://xxxx/tiangong/show/viewVideoById

**请求方式**

- 

**请求参数**



**返回示例**



**返回参数说明**







##### 3.3 查看词条

**简要描述**

- 查看词条

**请求URL**

- https://xxxx/tiangong/show/viewEntries

**请求方式**

- GET

**请求参数**

| 参数 | 必选 | 类型   | 说明   |
| ---- | ---- | ------ | ------ |
| id   | 是   | string | 百科id |

**返回示例**

```json
{
    "code":200,
    "data":{
        "entries_name":"xxx",
        "content_url":"...........",
        "version":12
    }
}

```

**返回参数说明**

| 参数         | 类型   | 说明   |
| ------------ | ------ | ------ |
| entries_name | string | 词条名 |
| content_url  | string | 资源   |
| version      | int    | 版本号 |



##### 3.4 修改百科

**简要描述**

- 修改词条

**请求URL**

- https://xxxx/tiangong/show/modifyEntries

**请求方式**

- PUT

**请求参数**

| 参数       | 必选 | 类型   | 说明     |
| ---------- | ---- | ------ | -------- |
| entries_id | 是   | string | 词条id   |
| content    | 是   | string | 资源     |
| user_id    | 是   | int    | 修改者id |
| reason     | 是   | string | 修改原因 |
| version    | 是   | int    | 版本号   |
| des        | 是   | string | 简介     |

版本号为获取该词条最新版本加1

**返回示例**

```json
{
    "code":200
}

```

**返回参数说明**

* 无

##### 3.5 查看最新百科列表

**简要描述**

- 查看最新词条列表

**请求URL**

- https://xxxx/tiangong/show/latestEntries

**请求方式**

- GET

**请求参数**

| 参数 | 必要 | 类型 | 说明          |
| ---- | ---- | ---- | ------------- |
| page | 否   | int  | 页数（默认1） |

**返回示例**

```json
{
    "code": 200,
    "data": {
        "introduction": {
            "endRow": 2,
            "firstPage": 1,
            "hasNextPage": false,
            "hasPreviousPage": false,
            "isFirstPage": true,
            "isLastPage": true,
            "lastPage": 1,
            "list": [
                {
                    "content": "{\n    \"code\": 200,\n    \"data\": {},\n    \"msg\": \"处理成功！\"\n}",
                    "cover_url": "..........",
                    "entries_id": 2,
                    "id": 2,
                    "is_used": false,
                    "ischeck": 0,
                    "reason": "创建",
                    "time": 1566744419000,
                    "user_id": 1,
                    "version": 1
                },
                {
                    "content": "{\n    \"code\": 200,\n    \"data\": {},\n    \"msg\": \"处理成功！\"\n}",
                    "cover_url": "..........",
                    "entries_id": 2,
                    "id": 1,
                    "is_used": false,
                    "ischeck": 0,
                    "reason": "创建",
                    "time": 1566744254000,
                    "user_id": 1,
                    "version": 1
                }
            ],
            "navigateFirstPage": 1,
            "navigateLastPage": 1,
            "navigatePages": 8,
            "navigatepageNums": [
                1
            ],
            "nextPage": 0,
            "pageNum": 1,
            "pageSize": 8,
            "pages": 1,
            "prePage": 0,
            "size": 2,
            "startRow": 1,
            "total": 2
        }
    },
    "msg": "处理成功！"
}

```

**返回参数说明**

| 参数            | 类型   | 说明   |
| --------------- | ------ | ------ |
| entries_id      | string | 词条id |
| entries_name    | string | 词条名 |
| introduction_id | string | 百科id |

##### 3.6 创建词条

**简要描述**

- 创建词条

**请求URL**

- https://xxxx/tiangong/show/newEntries

**请求方式**

- POST

**请求参数**

| 参数    | 必选 | 类型   | 说明   |
| ------- | ---- | ------ | ------ |
| name    | 是   | string | 词条名 |
| type    | 是   | string | 类型名 |
| type_id | 是   | int    | 类型id |



**返回示例**

```json
{
    "code":200,
}

```

**返回参数说明**

* 无



##### 3.7 创建百科

**请求URL**

* https://xxxx/tiangong/show/newIntroduction

**请求方式**

- POST

**请求参数**

| 参数       | 必选 | 类型   | 说明     |
| ---------- | ---- | ------ | -------- |
| entries_id | 是   | int    | 词条id   |
| content    | 是   | string | 类型名   |
| user_id    | 是   | int    | 创建人id |
| cover_url  | 是   | string | 封面     |
| 简介       | 是   | string | 简介     |

返回示例

```
{
	"code":200
}

```



##### 3.8 全部词条列表

**URl**

* https://xxxx/tiangong/show//showEntries

**方式**

* GET

**请求参数**

| 参数 | 必要 | 类型 | 说明          |
| ---- | ---- | ---- | ------------- |
| page | 否   | int  | 页数（默认1） |



##### 3.9 类型列表

**URl**

- https://xxxx/tiangong/show/typeList

**方式**

- GET

##### 3.10 新建类型

**URl**

- https://xxxx/tiangong/show/newTypes

**方式**

- POST



##### 3.11 查看某词条的历史列表

**简要描述**

-  查看某词条的历史列表

**请求URL**

- https://xxxx/tiangong/show/showVersionListWithAva

**请求方式**

- GET

**请求参数**

| 参数 | 必选 | 类型 | 说明   |
| ---- | ---- | ---- | ------ |
| id   | 是   | int  | 词条id |
| page | 否   | int  | 页数   |

**返回示例**

```json
{
    "code": 200,
    "data": {
        "pageInfo": {
            "endRow": 2,
            "firstPage": 1,
            "hasNextPage": false,
            "hasPreviousPage": false,
            "isFirstPage": true,
            "isLastPage": true,
            "lastPage": 1,
            "list": [
                {
                    "reason": "创建",
                    "ischeck": 0,
                    "avatar_url": "111111",
                    "user_id": 9,
                    "id": 4,
                    "entries_id": 1,
                    "time": 1567548784000,
                    "version": 1,
                    "content": "内容",
                    "is_used": true
                },
                {
                    "reason": "创建",
                    "ischeck": 0,
                    "avatar_url": "111111",
                    "user_id": 9,
                    "id": 6,
                    "entries_id": 1,
                    "time": 1567550247000,
                    "version": 2,
                    "content": "内容1111",
                    "is_used": false
                }
            ],
            "navigateFirstPage": 1,
            "navigateLastPage": 1,
            "navigatePages": 8,
            "navigatepageNums": [
                1
            ],
            "nextPage": 0,
            "pageNum": 1,
            "pageSize": 8,
            "pages": 1,
            "prePage": 0,
            "size": 2,
            "startRow": 1,
            "total": 2
        }
    },
    "msg": "处理成功！"
}

```



#### 4.学习模块

##### 4.1 查看教程列表

**简要描述**

- 查看教程列表

**请求URL**

- https://xxxx/tiangong/study/CourseList

**请求方式**

- GET

**请求参数**

* 无

**返回示例**

```json
{
    "code":200,
    "data":[
        {
            "course_id":12
            "course_name:""xxx"，
            "cover_url":".............."
        },{
            "course_id":112
            "course_name:""yyy"，
            "cover_url":".............."
        },{
            "course_id":123
            "course_name:""zzz"，
            "cover_url":".............."
        }
    ]
}

```



**返回参数说明**

| 参数        | 类型   | 说明   |
| ----------- | ------ | ------ |
| course_id   | string | 课程id |
| course_name | string | 课程名 |
| cover_url   | string | 资源   |



##### 4.2 查看教程

**简要描述**

- 查看教程

**请求URL**

- https://xxxx/tiangong/study/viewCourseById

**请求方式**

- GET

**请求参数**

| 参数 | 必选 | 类型   | 说明   |
| ---- | ---- | ------ | ------ |
| id   | 是   | string | 教程id |

**返回示例**

```json
{
    "code":200,
    "data":{
        "course_name":"xxx",
        "course_url":"...........",
        "release_time":2019-8-11,
        "user_id":12,
        "status":true,
        "like_count":2333,
        "favor_count":34,
		"comments_count":123,
		"click_count":6666,
		"share_count":3,
		"isdeleted":false,
		"des":"这是简介",
		"type":"雕塑",
        "type_id":12,
		"tag":false,
		"series_id":null,
		"is_paid":true,
		"isPass":true,
		"ischeck":true
    }
}

```

**返回参数说明**

| 参数           | 类型    | 说明       |
| -------------- | ------- | ---------- |
| course_name    | string  | 课程名     |
| course_url     | string  | 资源       |
| release_time   | date    | 发布时间   |
| user_id        | string  | 发布者     |
| status         | boolean | 教程状态   |
| like_count     | int     | 点赞       |
| favor_count    | int     | 收藏       |
| comments_count | int     | 评论       |
| click_count    | int     | 点击       |
| share_count    | int     | 分享       |
| isdeleted      | boolean | 是否删除   |
| des            | string  | 简介       |
| type           | int     | 类型       |
| type_id        | string  | 类型id     |
| tag            | boolean | 是否单期   |
| series_id      | string  | 系列名     |
| is_paid        | boolean | 是否付费   |
| isPass         | boolean | 是否过审   |
| ischeck        | boolean | 是否审核过 |



##### 4.3 查看视频列表

**简要描述**

- 查看视频列表

**请求URL**

- https://xxxx/tiangong/study/videoList

**请求方式**

- GET

**请求参数**

- 无

**返回示例**

```json
{
    "code": 200,
    "data": {
        "list": {
            "endRow": 2,
            "firstPage": 1,
            "hasNextPage": false,
            "hasPreviousPage": false,
            "isFirstPage": true,
            "isLastPage": true,
            "lastPage": 1,
            "list": [
                {
                    "click_count": 0,
                    "comments_count": 0,
                    "favor_count": 0,
                    "id": 2,
                    "isPass": false,
                    "ischeck": false,
                    "isdelete": false,
                    "like_count": 0,
                    "name": "雕塑视频2",
                    "release_time": 1566566816000,
                    "share_count": 0,
                    "status": true,
                    "type": "雕塑",
                    "type_id": 1,
                    "user_id": 1,
                    "video_url": "vedio/yqyh/ds2.avi"
                },
                {
                    "click_count": 0,
                    "comments_count": 0,
                    "favor_count": 0,
                    "id": 1,
                    "isPass": false,
                    "ischeck": false,
                    "isdelete": false,
                    "like_count": 1,
                    "name": "雕塑视频",
                    "release_time": 1566566792000,
                    "share_count": 0,
                    "status": true,
                    "type": "雕塑",
                    "type_id": 1,
                    "user_id": 1,
                    "video_url": "vedio/yqyh/ds.avi"
                }
            ],
            "navigateFirstPage": 1,
            "navigateLastPage": 1,
            "navigatePages": 1,
            "navigatepageNums": [
                1
            ],
            "nextPage": 0,
            "pageNum": 1,
            "pageSize": 10,
            "pages": 1,
            "prePage": 0,
            "size": 2,
            "startRow": 1,
            "total": 2
        }
    },
    "msg": "处理成功！"
}

```



**返回参数说明**

| 参数       | 类型   | 说明   |
| ---------- | ------ | ------ |
| video_id   | string | 视频id |
| video_name | string | 视频名 |
| video_url  | string | 资源   |





##### 4.4 查看视频

**简要描述**

- 查看视频

**请求URL**

- https://xxxx/tiangong/study/viewVideoById

**请求方式**

- GET

**请求参数**

| 参数 | 必选 | 类型 | 说明   |
| ---- | ---- | ---- | ------ |
| id   | 是   | int  | 视频id |

**返回示例**

```json
{
    "code":200,
    "data":{
        "video_name":"xxx",
        "video_url":"...........",
        "release_time":2019-8-11,
        "user_id":12,
        "status":true,
        "like_count":2333,
        "favor_count":34,
		"comments_count":123,
		"click_count":6666,
		"share_count":3,
		"isdeleted":false,
		"des":"这是简介",
		"type":"雕塑",
        "type_id":12,
        "craft_id":11,
		"is_paid":true,
		"isPass":true,
		"ischeck":true
    }
}

```

**返回参数说明**

| 参数           | 类型    | 说明         |
| -------------- | ------- | ------------ |
| video_name     | string  | 视频名       |
| video_url      | string  | 资源         |
| release_time   | date    | 发布时间     |
| user_id        | string  | 发布者       |
| status         | boolean | 视频状态     |
| like_count     | int     | 点赞         |
| favor_count    | int     | 收藏         |
| comments_count | int     | 评论         |
| click_count    | int     | 点击         |
| share_count    | int     | 分享         |
| isdeleted      | boolean | 是否删除     |
| des            | string  | 简介         |
| type           | int     | 类型         |
| type_id        | string  | 类型id       |
| craft_id       | string  | 所属工艺品id |
| is_paid        | boolean | 是否付费     |
| isPass         | boolean | 是否过审     |
| ischeck        | boolean | 是否审核过   |



#### 5.交流模块(完成）

##### 5.1 关注用户

**简要描述**

- 关注用户

**请求URL**

- https://xxxx/tiangong/communicate/focus

**请求方式**

- POST

**请求参数**

| 参数     | 必选 | 类型 | 说明       |
| -------- | ---- | ---- | ---------- |
| user_id  | 是   | int  | 用户id     |
| focus_id | 是   | int  | 被关注的id |

**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

* 无

##### 5.1 取消关注

**简要描述**

- 取消关注

**请求URL**

- https://xxxx/tiangong/communicate/deleteFocus

**请求方式**

- DELETE

**请求参数**

| 参数     | 必选 | 类型 | 说明       |
| -------- | ---- | ---- | ---------- |
| user_id  | 是   | int  | 用户id     |
| focus_id | 是   | int  | 被关注的id |

**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无





##### 5.2 关注列表

**简要描述**

- 关注列表

**请求URL**

- https://xxxx/tiangong/communicate/getFocusList

**请求方式**

- GET

**请求参数**

| 参数    | 必选 | 类型 | 说明   |
| ------- | ---- | ---- | ------ |
| user_id | 是   | int  | 用户id |

**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无



##### 5.3 被关注列表

**简要描述**

- 被关注列表

**请求URL**

- https://xxxx/tiangong/communicate/getFocusedList

**请求方式**

- GET

**请求参数**

| 参数    | 必选 | 类型 | 说明   |
| ------- | ---- | ---- | ------ |
| user_id | 是   | int  | 用户id |

**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无



##### 5.4删除用户

**简要描述**

- 删除用户

**请求URL**

- https://xxxx/tiangong/communicate/deleteFocus

**请求方式**

- DELETE

**请求参数**

| 参数     | 必选 | 类型 | 说明       |
| -------- | ---- | ---- | ---------- |
| user_id  | 是   | int  | 用户id     |
| focus_id | 是   | int  | 被关注的id |

**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无



##### 5.5 私信用户

**简要描述**

-  私信用户

**请求URL**

- https://xxxx/tiangong/communicate/call

**请求方式**

- POST

**请求参数**

| 参数    | 必选 | 类型   | 说明       |
| ------- | ---- | ------ | ---------- |
| user_id | 是   | string | 接收用户id |
| content | 是   | string | 发送内容   |
| id      | 是   | string | 发送方id   |

**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无







##### 5.6 删除私信

**请求方式**

- DELETE

**请求参数**

| 参数 | 必选 | 类型   | 说明   |
| ---- | ---- | ------ | ------ |
| id   | 是   | string | 消息id |



##### 5.7 获取私信列表

**简要描述**

- 获取私信列表

**请求URL**

- https://xxxx/tiangong/communicate/getMessagesList

**请求方式**

- GET

**请求参数**

| 参数    | 必选 | 类型   | 说明   |
| ------- | ---- | ------ | ------ |
| user_id | 是   | string | 用户id |



```json
{
    "code": 200,
    "data": {
        "list": [
            {
                "list": [
                    {
                        "isread": false,
                        "id": 1,
                        "isdelete": false,
                        "sender_id": 1,
                        "content": "你好",
                        "post_time": 1566488754000,
                        "recipient_id": 2
                    },
                    {
                        "isread": false,
                        "id": 2,
                        "isdelete": false,
                        "sender_id": 2,
                        "content": "你好啊",
                        "post_time": 1566385502000,
                        "recipient_id": 1
                    }
                ],
                "talker_id": 2,
                "talker_name": "chen",
                "url": "default.jpg"
            },
            {
                "list": [
                    {
                        "isread": false,
                        "id": 3,
                        "isdelete": false,
                        "sender_id": 1,
                        "content": "你好",
                        "post_time": 1566490202000,
                        "recipient_id": 3
                    }
                ],
                "talker_id": 3,
                "talker_name": "lw",
                "url": "default.jpg"
            },
            {
                "list": [
                    {
                        "isread": false,
                        "id": 4,
                        "isdelete": false,
                        "sender_id": 4,
                        "content": "你好",
                        "post_time": 1566490219000,
                        "recipient_id": 1
                    }
                ],
                "talker_id": 4,
                "talker_name": "user1",
                "url": "default.jpg"
            }
        ]
    },
    "msg": "处理成功！"
}

```



##### 5.8 发布动态

**简要描述**

- 发布动态

**请求URL**

- https://xxxx/tiangong/communicate/postDynamic

**请求方式**

- POST

**请求参数**

| 参数    | 必选 | 类型   | 说明       |
| ------- | ---- | ------ | ---------- |
| id      | 是   | string | 用户id     |
| content | 是   | string | 发送内容   |
| files   | 是   | file[] | 发送的图片 |



**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无



##### 5.9 获取我和关注的人的动态列表

**简要描述**

- 发布动态

**请求URL**

- https://xxxx/tiangong/communicate/allMyDynamic

**请求方式**

- POST

**请求参数**

| 参数 | 必选 | 类型   | 说明   |
| ---- | ---- | ------ | ------ |
| id   | 是   | string | 用户id |



**返回示例**

```json
{
    "code": 200,
    "data": {
        "list": [
            {
                "share_count": 0,
                "like_count": 0,
                "picetures": [
                    {
                        "content_url": "http://129.211.26.221:8080/tiangong/dynamics/1566892475061TIM图片20190826220510.png",
                        "id": 5
                    }
                ],
                "user_id": 3,
                "comments_count": 0,
                "id": 5,
                "isdelete": false,
                "content": "qwertyvd",
                "post_time": 1566921274000
            },
            {
                "share_count": 0,
                "like_count": 0,
                "picetures": [],
                "user_id": 1,
                "comments_count": 0,
                "id": 1,
                "isdelete": false,
                "content": "",
                "post_time": 1566917291000
            },
            {
                "share_count": 0,
                "like_count": 0,
                "picetures": [],
                "user_id": 1,
                "comments_count": 0,
                "id": 2,
                "isdelete": false,
                "content": "gyiffiyviyc8",
                "post_time": 1566918275000
            },
            {
                "share_count": 0,
                "like_count": 0,
                "picetures": [],
                "user_id": 1,
                "comments_count": 0,
                "id": 3,
                "isdelete": false,
                "content": "gyiffiyviyc8",
                "post_time": 1566919400000
            },
            {
                "share_count": 0,
                "like_count": 0,
                "picetures": [
                    {
                        "content_url": "http://129.211.26.221:8080/tiangong/dynamics/1566891086457TIM图片20190826220510.png",
                        "id": 4
                    }
                ],
                "user_id": 1,
                "comments_count": 0,
                "id": 4,
                "isdelete": false,
                "content": "efwefwfwefwd",
                "post_time": 1566919886000
            }
        ]
    },
    "msg": "处理成功！"
}

```

**返回参数说明**

- 无





##### 5.10 获取我的动态列表

**简要描述**

- 发布动态

**请求URL**

- https://xxxx/tiangong/communicate/myDynamic

**请求方式**

- POST

**请求参数**

| 参数 | 必选 | 类型   | 说明   |
| ---- | ---- | ------ | ------ |
| id   | 是   | string | 用户id |



**返回示例**

```json
{
    "code": 200,
    "data": {
        "list": [
            {
                "share_count": 0,
                "like_count": 0,
                "picetures": [],
                "user_id": 1,
                "comments_count": 0,
                "id": 1,
                "isdelete": false,
                "content": "",
                "post_time": 1566917291000
            },
            {
                "share_count": 0,
                "like_count": 0,
                "picetures": [],
                "user_id": 1,
                "comments_count": 0,
                "id": 2,
                "isdelete": false,
                "content": "gyiffiyviyc8",
                "post_time": 1566918275000
            },
            {
                "share_count": 0,
                "like_count": 0,
                "picetures": [],
                "user_id": 1,
                "comments_count": 0,
                "id": 3,
                "isdelete": false,
                "content": "gyiffiyviyc8",
                "post_time": 1566919400000
            },
            {
                "share_count": 0,
                "like_count": 0,
                "picetures": [
                    {
                        "content_url": "http://129.211.26.221:8080/tiangong/dynamics/1566891086457TIM图片20190826220510.png",
                        "id": 4
                    }
                ],
                "user_id": 1,
                "comments_count": 0,
                "id": 4,
                "isdelete": false,
                "content": "efwefwfwefwd",
                "post_time": 1566919886000
            }
        ]
    },
    "msg": "处理成功！"
}

```

**返回参数说明**

- 无



##### 5.11 活动列表



**请求参数**

* 无



##### 5.12 发布线下聚会

**简要描述**

- 发布线下聚会

**请求URL**

- https://xxxx/tiangong/communicate/newActivity

**请求方式**

- POST

**请求参数**

| 参数      | 必选 | 类型   | 说明       |
| --------- | ---- | ------ | ---------- |
| user_id   | 是   | string | 发布用户id |
| content   | 是   | string | 发送内容   |
| time      | 是   | long   | 截止时间   |
| cover_url | 是   | string | 封面       |
| name      | 是   | string | 活动名     |

**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无



##### 5.13 参与线下聚会

**简要描述**

* 参与线下聚会

**请求URL**

- https://xxxx/tiangong/communicate/joinActivity

**请求方式**

- POST

**请求参数**

| 参数      | 必选 | 类型   | 说明       |
| --------- | ---- | ------ | ---------- |
| member_id | 是   | string | 参与用户id |
| id        | 是   | string | 活动id     |

**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无



##### 5.14展示活动成员

**请求URL**

- https://xxxx/tiangong/communicate/getMembers

**请求参数**

| 参数 | 必选 | 类型 | 说明   |
| ---- | ---- | ---- | ------ |
| id   | 是   | int  | 活动id |



#### 6.搜索模块（完成）

##### 6.1 展示搜索到的结果

**简要描述**

- 展示搜索到的词条

**请求URL**

- https://xxxx/tiangong/search

**请求方式**

- PUT

**请求参数**

| 参数 | 必选 | 类型   | 说明     |
| ---- | ---- | ------ | -------- |
| text | 是   | string | 搜索内容 |

**返回示例**

```json
{
    "code":200,
    "data":[
		articles:[..],
    	video:[..],
    	course[..],
		...
    ]
}

```

**返回参数说明**

无



#### 7.互动模块（完成)

##### 7.1 点赞

**简要描述**

- 点赞

**请求URL**

- https://xxxx/tiangong/like/...

注：点赞课程course、视频video、文章Article

**请求方式**

- POST

**请求参数**

| 参数    | 必选 | 类型 | 说明   |
| ------- | ---- | ---- | ------ |
| user_id | 是   | int  | 用户id |
| id      | 是   | int  | 作品id |



**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无



##### 7.2 收藏

**简要描述**

- 收藏

**请求URL**

- https://xxxx/tiangong/favor/favorById

注：点赞课程course、视频video、文章Article

**请求方式**

- POST

**请求参数**

| 参数    | 必选 | 类型 | 说明     |
| ------- | ---- | ---- | -------- |
| user_id | 是   | int  | 用户id   |
| id      | 是   | int  | 作品id   |
| type    | 是   | int  | 作品类型 |

**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无

##### 7.4我的收藏列表

**简要描述**

- 我的收藏列表

**请求URL**

- https://xxxx/tiangong/favor/myFavor

注：点赞课程course、视频video、文章Article

**请求方式**

- GET

**请求参数**

| 参数 | 必选 | 类型 | 说明   |
| ---- | ---- | ---- | ------ |
| id   | 是   | int  | 用户id |

**返回示例**

```json
{
    "code": 200,
    "data": {
        "course": [...],
        "video": [...],
        "article": [
            {
                "cover_url": "http://localhost:8090/tiangong/share/cover/15666134103641.jpg",
                "like_count": 0,
                "favor_count": 0,
                "type_id": 1,
                "click_count": 0,
                "title": "标题",
                "post_time": 1566695678000,
                "share_count": 0,
                "ischeck": false,
                "user_id": 1,
                "comments_count": 0,
                "content_url": "<!doctype html>\n<html lang=\"en\">\n\n<head>\n\t<title>HTTP Status 400 – Bad Request</title>\n\t<style type=\"text/css\">\n\t\th1 {\n\t\t\tfont-family: Tahoma, Arial, sans-serif;\n\t\t\tcolor: white;\n\t\t\tbackground-color: #525D76;\n\t\t\tfont-size: 22px;\n\t\t}\n\n\t\th2 {\n\t\t\tfont-family: Tahoma, Arial, sans-serif;\n\t\t\tcolor: white;\n\t\t\tbackground-color: #525D76;\n\t\t\tfont-size: 16px;\n\t\t}\n\n\t\th3 {\n\t\t\tfont-family: Tahoma, Arial, sans-serif;\n\t\t\tcolor: white;\n\t\t\tbackground-color: #525D76;\n\t\t\tfont-size: 14px;\n\t\t}\n\n\t\tbody {\n\t\t\tfont-family: Tahoma, Arial, sans-serif;\n\t\t\tcolor: black;\n\t\t\tbackground-color: white;\n\t\t}\n\n\t\tb {\n\t\t\tfont-family: Tahoma, Arial, sans-serif;\n\t\t\tcolor: white;\n\t\t\tbackground-color: #525D76;\n\t\t}\n\n\t\tp {\n\t\t\tfont-family: Tahoma, Arial, sans-serif;\n\t\t\tbackground: white;\n\t\t\tcolor: black;\n\t\t\tfont-size: 12px;\n\t\t}\n\n\t\ta {\n\t\t\tcolor: black;\n\t\t}\n\n\t\ta.name {\n\t\t\tcolor: black;\n\t\t}\n\n\t\t.line {\n\t\t\theight: 1px;\n\t\t\tbackground-color: #525D76;\n\t\t\tborder: none;\n\t\t}\n\t</style>\n</head>\n\n<body>\n\t<h1>HTTP Status 400 – Bad Request</h1>\n\t<hr class=\"line\" />\n\t<p><b>Type</b> Status Report</p>\n\t<p><b>Message</b> Required String parameter &#39;text&#39; is not present</p>\n\t<p><b>Description</b> The server cannot or will not process the request due to something that is perceived to be a\n\t\tclient error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing).\n\t</p>\n\t<hr class=\"line\" />\n\t<h3>Apache Tomcat/8.5.28</h3>\n</body>\n\n</html>",
                "id": 1,
                "isdelete": false,
                "isPass": false,
                "status": true
            },...
        ]
    },
    "msg": "处理成功！"
}

```

**返回参数说明**

- 无



##### 7.5 取消收藏

**简要描述**

- 取消收藏

**请求URL**

- https://xxxx/tiangong/favor/deleteById

注：点赞课程course、视频video、文章Article

**请求方式**

- DELETE

**请求参数**

| 参数    | 必选 | 类型 | 说明     |
| ------- | ---- | ---- | -------- |
| user_id | 是   | int  | 用户id   |
| id      | 是   | int  | 作品id   |
| type    | 是   | int  | 作品类型 |

**返回示例**



##### 7.6 评论

**简要描述**

- 评论

**请求URL**

- https://xxxx/tiangong/comments/comment

**请求方式**

- POST

**请求参数**

| 参数      | 必选 | 类型    | 说明           |
| --------- | ---- | ------- | -------------- |
| user_id   | 是   | int     | 用户id         |
| item_id   | 是   | int     | 作品id         |
| content   | 是   | string  | 评论           |
| parent_id | 否   | int     | 父评论id       |
| is_reply  | 否   | boolean | 是否是作者回复 |
| type      | 是   | int     | 评论类型       |

* 评论类型 1 文章；2 视频；3 教程；4 动态



**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无





##### 7.7 获取评论列表

- 获取评论列表

**请求URL**

- https://xxxx/tiangong/comments/getCommentById

**请求方式**

* GET

**请求参数**

| 参数 | 必选 | 类型 | 说明     |
| ---- | ---- | ---- | -------- |
| id   | 是   | int  | 作品id   |
| type | 是   | int  | 作品类型 |



**返回示例**

```json
{
    "code": 200,
    "data": {
        "list": [
            {
                "avatat_url": "default.jpg",
                "content": "哈哈",
                "id": 1,
                "like_count": 0,
                "list": [
                    {
                        "like_count": 0,
                        "avatar_url": "default.jpg",
                        "user_id": 1,
                        "item_id": 1,
                        "parent_id": 1,
                        "id": 3,
                        "isdelete": false,
                        "type": 1,
                        "post_time": 1566751286000,
                        "content": "哈哈",
                        "username": "yqyh",
                        "is_reply": false
                    },
                    {
                        "like_count": 0,
                        "avatar_url": "default.jpg",
                        "user_id": 1,
                        "item_id": 1,
                        "parent_id": 1,
                        "id": 4,
                        "isdelete": false,
                        "type": 1,
                        "post_time": 1566751292000,
                        "content": "哈哈1111",
                        "username": "yqyh",
                        "is_reply": false
                    }
                ],
                "parent_id": 0,
                "post_time": 1566751112000,
                "user_id": 1,
                "username": "yqyh"
            },
            {
                "avatat_url": "default.jpg",
                "content": "哈哈",
                "id": 2,
                "like_count": 0,
                "list": [],
                "parent_id": 0,
                "post_time": 1566751222000,
                "user_id": 1,
                "username": "yqyh"
            }
        ]
    },
    "msg": "处理成功！"
}

```



##### 7.8 举报评论

**简要描述**

- 举报评论

**请求URL**

- https://xxxx/tiangong/comments/report

**请求方式**

- POST

**请求参数**

| 参数 | 必选 | 类型 | 说明     |
| ---- | ---- | ---- | -------- |
| id   | 是   | int  | 评论id   |
| type | 是   | int  | 评论类型 |

- 评论类型 1 文章；2 视频；3 教程；4 动态



**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无



#### 8.分享模块 (完成)

##### 8.1 上传教程

**简要描述**

* 上传教程

**请求URL**

* https://xxxx/tiangong/share/course

**请求方式**

* POST

**请求参数**

| 参数      | 必选 | 类型    | 说明     |
| --------- | ---- | ------- | -------- |
| name      | 是   | string  | 课程名   |
| file      | 是   | file    | 资源     |
| user_id   | 是   | int     | 发布者   |
| cover     | 是   | string  | 封面     |
| des       | 否   | string  | 简介     |
| is_paid   | 是   | boolean | 是否付费 |
| type_id   | 是   | string  | 类型id   |
| tag       | 是   | boolean | 是否单期 |
| series_id | 否   | string  | 系列名   |



**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无



##### 8.2 上传视频

**简要描述**

- 上传视频

**请求URL**

- https://xxxx/tiangong/share/video

**请求方式**

- POST

**请求参数**

| 参数     | 必选 | 类型   | 说明         |
| -------- | ---- | ------ | ------------ |
| name     | 是   | string | 视频名       |
| file     | 是   | file   | 资源         |
| user_id  | 是   | string | 发布者       |
| cover    | 是   | string | 封面         |
| des      | 否   | string | 简介         |
| type_id  | 是   | int    | 类型id       |
| craft_id | 否   | string | 所属工艺品id |



**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无



##### 8.3 上传3D模型

**简要描述**

- 上传3D模型

**请求URL**

- https://xxxx/tiangong/share/model

**请求方式**

- POST

**请求参数**

| 参数       | 必选 | 类型   | 说明       |
| ---------- | ---- | ------ | ---------- |
| entries_id | 是   | int    | 词条id     |
| user_id    | 是   | int    | 上传用户id |
| 3d_url     | 是   | string | 3d资源     |

**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无

##### 8.4 上传文章

**简要描述**

- 上传文章

**请求URL**

- https://xxxx/tiangong/share/article

**请求方式**

- POST

**请求参数**

| 参数      | 必选 | 类型   | 说明         |
| --------- | ---- | ------ | ------------ |
| file      | 是   | text   | 资源         |
| user_id   | 是   | string | 发布者       |
| cover_url | 否   | string | 封面         |
| title     | 是   | string | 标题         |
| type_id   | 是   | string | 类型id(1)    |
| craft_id  | 否   | int    | 所属工艺品id |



**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无







##### 8.6 上传图片

**简要描述**

- 上传图片

**请求URL**

- https://xxxx/tiangong/share/picture

**请求方式**

- POST

**请求参数**

| 参数 | 必选 | 类型 | 说明 |
| ---- | ---- | ---- | ---- |
| file | 是   | file | 资源 |



**返回示例**

```json
{
	"code":200
    “data":{
    "path":"http\...\picture\..."
}
}

```

**返回参数说明**

- 无



##### 8.7  上传封面

**简要描述**

- 上传封面

**请求URL**

- https://xxxx/tiangong/share/cover

**请求方式**

- POST

**请求参数**

| 参数 | 必选 | 类型 | 说明 |
| ---- | ---- | ---- | ---- |
| file | 是   | file | 资源 |



**返回示例**

```json
{
	"code":200
    “data":{
    "path":"http\...\cover\..."
}
}

```

**返回参数说明**

- 无



#### #9.支付模块

##### 9.1 购买付费课程

**简要描述**

- 购买付费课程

**请求URL**

- https://xxxx/tiangong/pay/buyCourse

**请求方式**

- POST

**请求参数**

| 参数      | 必选 | 类型 | 说明   |
| --------- | ---- | ---- | ------ |
| user_id   | 是   | int  | 用户id |
| course_id | 是   | int  | 教程id |

**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无



##### 9.2  购买去广告服务

**简要描述**

- 购买去广告服务

**请求URL**

- https://xxxx/tiangong/pay/removeAdv

**请求方式**

- 

**请求参数**

| 参数    | 必选 | 类型 | 说明     |
| ------- | ---- | ---- | -------- |
| user_id | 是   | int  | 用户id   |
| time    | 是   | date | 购买时间 |



**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无



##### 9.3 充值

**简要描述**

- 充值

**请求URL**

- https://xxxx/tiangong/pay/recharge

**请求方式**

- POST

**请求参数**

| 参数    | 必选 | 类型 | 说明     |
| ------- | ---- | ---- | -------- |
| user_id | 是   | int  | 用户id   |
| count   | 是   | date | 充值金额 |



**返回示例**

```json
{
	"code":200
}

```

**返回参数说明**

- 无