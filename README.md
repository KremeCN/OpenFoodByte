# Open FoodByte
FoodByte开源计划，本计划是对Ho3在2020年进行的Open Hanabi计划进行致敬。

## 苏辰抄了哪些代码？
[治军今天抄什么](WHATDIDZHIJUNPASTETODAY.md)
## 什么是FoodByte？
FoodByte是由苏辰编写的垃圾我的世界外挂，大部分代码均为白治军从其他外挂中抄袭而来。在此项目中你会见到大量的抄袭的垃圾代码。

## 苏辰是谁？
苏辰自2017年开始使用Java字节码编辑工具修改字符串达到所谓魔改客户端的效果， 其在国服出售名为Asu的魔改Flux b13。
后来苏辰开始抄袭客户端，这使得苏辰一发不可收拾，自2018年以来苏辰已经成功跑路了Asu、苏辰工具箱、Power数五次、PowerX、Skyblock Lite。

同时苏辰具有极强的造谣能力，因为其客户端售卖价格极高以至于有小学生花了上千元人民币来购买其外挂，而导致其小学生舔狗十分之多。

然而实际上苏辰并没有什么能力，从本项目中就看得出来苏辰没有什么实际能力。

* 在EventMotion中，苏辰在声明变量时使用了static关键字。
* 整个客户端中充斥着大量英语语法错误。
* 整个客户端中存在大量抄袭代码。
* 整个客户端中存在大量重复代码。
* 客户端整体几乎不存在任何O(1)算法。

我始终不明白为什么这样的人还会有人舔，舔的同时还不忘记造谣并且发布弱智言论。

## 项目完成度？
项目佛系完成，取决于苏辰恶心我的程度。越恶心我本项目进行速度越快。

* Java层反混淆。(已完成部分反混淆，仍有少许垃圾代码和强保护部分尚未完成)
* 将客户端Instance部分Rename还原。（约30%）
* 还原Native部分代码。（UHC TP、XRay等，当然XRay代码已经公开，具体请看本项目中的视频）
* 还原客户端注入部分，完成客户端加载。

强保护Class的字符串初始化部分在Native中，我们已经使用调试器成功获取到初始化部分的结果，因此KillAura等强保护Class的反混淆很快就会推送。

## 我会被远控吗？
项目进行过程中已经发现FoodByte有两处远程Shell执行。

* Native部分中，有一处ShellExecuteA，执行从验证服务器中返回的命令。
* Java部分中，处理IRC命令时，发现有一处Runtime.exec()，执行从IRC服务器中返回的命令。

因此在FoodByte中存在远控，在此项目中不包含Native部分，因此第一条在本项目中不存在。第二条已经移除。
但本人能力有限，尚未发现更多潜在的后门。因此本人为避免苏辰使用后门远控使用破解的用户后甩锅给我，本人不会发布破解。

当然，抄袭本项目的代码不会被远控。