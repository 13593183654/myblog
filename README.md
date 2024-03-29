# myblog-by point9
## 项目概述
MyBlog-Java人自己的博客平台。基于SpringBoot的Java开源博客系统。前后台功能完善，页面简洁大方，支持移动端自适应。
blog-v1-single MyBlog-单机版，即应用程序、数据库、文件等所有的资源都在一台服务器上。单机版适用于大部分博主用户，
解压缩到tomcat下即可使用；其余部分基于微服务系统架构，实现了后期的可扩展性，文件系统采用分布式文件系统。
系统引入NoSQL数据库及搜索引擎。
## 项目结构
| 模块      | 解释     | 备注     |
| ---------- | :-----------:  | :-----------: |
| blog-v1-api     |   接口层   |  面向接口编程    |
| blog-v1-base     |   基础层   |  公共类，实体类，映射文件    |
| blog-v1-docs     |   文档层   |  每次更新的文档说明文件    |
| blog-v1-service     |   服务层   |  接口的具体实现文件    |
| blog-v1-single     |   单机版   |  所有服务运行在同一个服务器    |
| blog-v1-temp     |   案例层   |  开发中编写小demo文件    |
| blog-v1-web     |   视图层   |  控制器及前后台页面文件    |
## 功能描述
1. 个人设置：支持用户名，密码、昵称、一句话描述等修改操作；
2. 文章管理：支持文章的CRUD，代码高亮，实时保存，发布状态审核；
3. 页面管理：支持页面的CRUD，自定义页面路径，SEO关键词设置；
4. 分类管理：支持分类的CRUD，支持分类内连接，支持智能排序；
5. 标签管理：支持标签的CRUD，支持多彩标签，字体大小多变;
6. 评论管理：支持评论的CRUD，支持评论分页，楼层评论，回复提醒；
7. 文件管理：支持文件的CRUD，支持FastDFS,七牛云等；
8. 主题管理：支持导入基于MyBlog-API开发的第三方主题；
9. 插件管理：支持导入基于MyBlog-API开发的第三方插件；
10. 微信管理：支持微信公众号的在线管理，文章实时同步更新，在线引流；
11. 系统管理：网站设置，统计分析，数据备份，缓存加速等。
## 相关技术
### 1、后端
- SpringBoot
- Spring
- SpringMVC
- SpringSecurity
- MyBatis
- MySQL
- tomcat
- thymeleaf
- junit
- Dubbo
- FastDFS
### 2、前端
- HTML5
- CSS3
- JavaScript
- JQuery
- BootStrap
- Amaze UI
- wangEditor
- Uploadify
- ECharts
## 项目展示
后台登录
![后台登陆](http://www.point9.top/wp-content/uploads/2019/03/admin_login.png)
后台首页
![后台首页](http://www.point9.top/wp-content/uploads/2019/03/admin_index.png)
## 团队成员
MyBlog开源博客系统，邀请您加入开发者团队，一起成长！

<a href="http://www.point9.top" target="_blank">点九博客</a> - 励志成为web全栈工程师
   
<a href="http://www.guimeiling.com" target="_blank">红色枫叶</a>
## 反馈建议
点九邮箱    blog@point9.top

QQ群交流    177014281

微信留言   

![点九博客](http://www.point9.top/wp-content/uploads/2019/02/qrcode_for_gh_f9e0d2e01b09_344.jpg )
## 版权声明
本项目免费开源，提供长期更新迭代，还请保留文件中的版权和作者信息，并在你的产品说明中注明项目开源地址，如需友联请先添加【点九博客】- www.point9.top 为首页友情链接，并在邮件私信，我将在挣得您的同意后，在本页面MyBlog在用站点板块，添加您的博客地址。
## 在用站点
项目持续开发中。。。暂无上线站点Demo,敬请关注，感谢您的支持！
## 项目鸣谢
- 感谢广大开发者，无私分享的网友，以及一直陪伴的群友；
- 感谢BootStrap等优秀开源项目的开发者，做了技术铺垫