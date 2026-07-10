from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        x = defaultdict(list)

        for i in strs:
            key = "".join(sorted(i))
            x[key].append(i)

        return list(x.values())