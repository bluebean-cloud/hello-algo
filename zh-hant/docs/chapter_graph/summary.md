# 小結

### 重點回顧

- 圖由頂點和邊組成，可以表示為一組頂點和一組邊構成的集合。
- 相較於線性關係（鏈結串列）和分治關係（樹），網路關係（圖）具有更高的自由度，因而更為複雜。
- 有向圖的邊具有方向性，連通圖中的任意頂點均可達，有權圖的每條邊都包含權重變數。
- 鄰接矩陣利用矩陣來表示圖，每一行（列）代表一個頂點，矩陣元素代表邊，用 $1$ 或 $0$ 表示兩個頂點之間有邊或無邊。鄰接矩陣在增刪查改操作上效率很高，但空間佔用較多。
- 鄰接表使用多個鏈結串列來表示圖，第 $i$ 個鏈結串列對應頂點 $i$ ，其中儲存了該頂點的所有鄰接頂點。鄰接表相對於鄰接矩陣更加節省空間，但由於需要走訪鏈結串列來查詢邊，因此時間效率較低。
- 當鄰接表中的鏈結串列過長時，可以將其轉換為紅黑樹或雜湊表，從而提升查詢效率。
- 從演算法思想的角度分析，鄰接矩陣體現了“以空間換時間”，鄰接表體現了“以時間換空間”。
- 圖可用於建模各類現實系統，如社交網路、地鐵線路等。
- 樹是圖的一種特例，樹的走訪也是圖的走訪的一種特例。
- 圖的廣度優先走訪是一種由近及遠、層層擴張的搜尋方式，通常藉助佇列實現。
- 圖的深度優先走訪是一種優先走到底、無路可走時再回溯的搜尋方式，常基於遞迴來實現。

### Q & A

**Q**：路徑的定義是頂點序列還是邊序列？

維基百科上不同語言版本的定義不一致：英文版是“路徑是一個邊序列”，而中文版是“路徑是一個頂點序列”。以下是英文版原文：In graph theory, a path in a graph is a finite or infinite sequence of edges which joins a sequence of vertices.

在本文中，路徑被視為一個邊序列，而不是一個頂點序列。這是因為兩個頂點之間可能存在多條邊連線，此時每條邊都對應一條路徑。

**Q**：非連通圖中是否會有無法走訪到的點？

在非連通圖中，從某個頂點出發，至少有一個頂點無法到達。走訪非連通圖需要設定多個起點，以走訪到圖的所有連通分量。

**Q**：在鄰接表中，“與該頂點相連的所有頂點”的頂點順序是否有要求？

可以是任意順序。但在實際應用中，可能需要按照指定規則來排序，比如按照頂點新增的次序，或者按照頂點值大小的順序等，這樣有助於快速查詢“帶有某種極值”的頂點。
