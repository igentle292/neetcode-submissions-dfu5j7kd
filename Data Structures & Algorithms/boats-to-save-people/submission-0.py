class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        result = 0
        people.sort()

        l = 0
        r = len(people) - 1

        while l <= r:
            if l == r:
                result += 1
                l += 1
                r -= 1
            elif people[r] == limit:
                result += 1
                r -= 1
            elif (people[l] + people[r]) > limit:
                result += 1
                r -= 1
            else:
                result += 1
                l += 1
                r -= 1

        return result
        
