# springboot_wxDev
SpringBoot+wx devtool

### 1.下载
	1>微信开发者工具  https://developers.weixin.qq.com/miniprogram/dev/devtools/stable.html
	2>AppID注册   https://mp.weixin.qq.com/cgi-bin/wx?token=&lang=zh_CN
	3>java环境安装
	4>下载maven  https://maven.apache.org/download.cgi （apache-maven-3.8.2-bin.zip），并配置环境变量M2_HOME中,输入mvn -v验证是否安装成功
	5>IDEA安装，配置maven  https://blog.csdn.net/weixin_43581288/article/details/106598571
	6>在空文件夹下新建pom.xml,右键add as maven project，然后配置pom   https://blog.csdn.net/weixin_38361347/article/details/83904692
### 2.SpringBoot简单使用
	1>新建一个Application类
		@SpringBootApplication
		public class Application {
			public static void main(String[] args) {
				SpringApplication.run(Application.class,args);
			}
		}
	2>新建一个testController类
		@RestController
		@RequestMapping("/api/test")
		public class testController {
			@GetMapping("/hello")
			public String func(){
				return "hello world";
			}
		}
	3>这样一个最简单的项目就可以成功运行起来了，访问http://127.0.0.1:8080/api/test/hello就可以看到