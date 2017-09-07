本项目初始是公司要推JPA + Springboot 的服务使用，把框架搭建好后就分享一下。没什么技术含量。


1.采用的框架。
    Springboot + jpa
2.其他
    1>.Kotlin 可以直接使用，如果你是Idea跑那么就可以直接使用，如果是Eclipse相关就去pom里删除哪几个jar，pom里有描述。
    2>.添加了Redis的依赖包，还没配置使用。
    3>.JDK7可以跑，但是如果要用Kotlin的话，必须JDK 1.8
3.数据库相关
    Mysql
    启动项目配置的是create-drop，就是会重新创建表。那么根目录下有一条测试数据。insert即可。

4.遇到的坑
    1>.getOne ，get*系列的方法有毒，而且是有传染的毒。就是如果我调用了一个getOne，那么下面正常的find*都会和get*一样不好使。
    2>.数据库编码问题，本身不应该出现的，没在数据库链接上加上“?useUnicode=true&characterEncoding=utf-8” 导致中文查询和插入乱码
















