class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        # temp_set = set(())
        
        # #check rows
        # for sub_list in board:
        #     for char in sub_list:
        #         if char != ".":
        #             if char in temp_set:
        #                 return False
        #             temp_set.add(char)
        #     temp_set.clear()

        # #check columns
        # for i in range(9):
        #     for sub_list in board:
        #         char = sub_list[i]
        #         if char != ".":
        #             if char in temp_set:
        #                 return False
        #             temp_set.add(char)
        #     temp_set.clear()

        rows = [0] * 9
        cols = [0] * 9
        boxes = [0] * 9         #00, 01, 02, 10, 11 etc
        for i in range(9):
            rows[i] = set(())
            cols[i] = set(())
            boxes[i] = set(())
            
        for i in range(9):
            for j in range(9):
                val = board[i][j]
                box = ((i // 3) * 3) + (j // 3)
                if val != ".":
                    if val in rows[i]:
                        print(val)
                        print("present in row")
                        print(i)
                        return False
                    if val in cols[j]:
                        print(val)
                        print("present in col")
                        print(j)
                        return False
                    if val in boxes[box]:
                        print(val)
                        print("present in box")
                        print(box)
                        return False
                    rows[i].add(val)
                    cols[j].add(val)
                    boxes[box].add(val)

        return True