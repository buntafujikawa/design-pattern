# Commandパターン
命令をオブジェクトとして表現し、履歴をとったり再実行を行ったりすることができるデザインパターン

## 登場人物
- Command(命令)の役  
Commandインターフェース
- ConcreateCommand(具体的な命令)の役  
MacroCommandクラスやDrawCommandクラス
- Receiver(受信者)の役  
DrawCanvasクラス
- Client(利用者)の役  
Mainクラス
- Invoker(起動者)の役  
Mainクラス、DrawCanvasクラス

## クラス図
![command](https://user-images.githubusercontent.com/11749585/34570216-6d706718-f1ae-11e7-9d2d-5c34f1e47df8.jpg)
