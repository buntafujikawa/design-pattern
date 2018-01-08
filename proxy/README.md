# Proxyパターン
本人が必要になるときまで代理人に仕事をしてもらうデザインパターン

- Virtual Proxy
- Remote Proxy
- Access Proxy

## 登場人物
- Subject(主体)の役  
Printableインターフェース
- Proxy(代理人)の役  
PrinterProxyクラス
- RealSubject(実際の主体)の役  
Printerクラス
- Client(依頼人)の役  
Mainクラス

## クラス図
![proxy](https://user-images.githubusercontent.com/11749585/34570231-6fe78fa8-f1ae-11e7-9650-62fb97ba96dd.jpg)
