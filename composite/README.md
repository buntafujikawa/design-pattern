# Compositeパターン
容器と中身を同一視し、再帰的な構造を作るデザインパターン

- 複数と単数の同一視  
複数個のものを集めて、それをあたかも1つのものであるかのように取り扱う

## 登場人物
- Leaf(葉)の役  
Fileクラス
- Composite(複合体)の役  
Directoryクラス
- Componentの役  
Entryクラス
- Client(依頼者)の役  
Mainクラス

## クラス図
![composite](https://user-images.githubusercontent.com/11749585/34570218-6d928064-f1ae-11e7-97a1-d73ac0997576.jpg)
