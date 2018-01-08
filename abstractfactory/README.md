# Abstract Factoryパターン
部品の具体的な実装には注目せず、インターフェースに注目し、そのインターフェースだけを使って部品を組み立て、製品にまとめるデザインパターン

抽象的=具体的にどのように実装されているかについては考えず、インターフェースだけに注目している状態

## 登場人物
- AbstractProduct(抽象的な製品)の役  
Linkクラス、Trayクラス、Pageクラス
- AbstractFactory(抽象的な工場)の役  
Factoryクラス
- Client(利用者)の役  
Mainクラス
- ConcreateProduct(具体的な製品)の役  
listfactory以下のクラス(ListFactoryクラスを除く)
- ConcreateProduct(具体的な工場)の役  
ListFactoryクラス

## クラス図
![abstractfactory](https://user-images.githubusercontent.com/11749585/34658559-5384ab6c-f473-11e7-9e88-4495a738ec54.jpg)
