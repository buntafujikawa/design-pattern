# Factory Methodパターン
インスタンスの作り方をスーパークラスの側で定め、具体的な肉付けは全てサブクラスの側で行うデザインパターン

## 登場人物
- Product(製品)の役  
Productクラス
- Creator(作成者)の役  
Factoryクラス
- ConcreateProduct(具体的な製品)の役  
IDCardクラス
- ConcreateCreator(具体的な作成者)の役  
IDCardFactoryクラス

## クラス図
![factorymethod](https://user-images.githubusercontent.com/11749585/34570222-6e285120-f1ae-11e7-9068-6b59389f7874.jpg)
