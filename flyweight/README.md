# Prototypeパターン
メモリの消費を少なくするためにインスタンスを共有(シェア)させるデザインパターン

- intrinsicな情報  
場所や状況に依存しないので共有できる
- extrinsicな情報  
場所や状況に依存しないので共有できない

## 登場人物
- Flyweight(フライ級)の役  
BigCharクラス
- FlyweightFactory(フライ級の工場)の役  
BigCharFactoryクラス
- Client(依頼者)の役  
BigStringクラス

## クラス図
![flyweight](https://user-images.githubusercontent.com/11749585/34570223-6e50fe18-f1ae-11e7-94ac-357198b0b9a9.jpg)
