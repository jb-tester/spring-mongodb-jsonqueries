## Tests for the document field referencing from the JSON queries

The test cases for the document field references inside JSON queries - completion, navigation, find usages, rename.
The queries syntax is not checked here.

#####  1. Single-class documents:

* fields without ``@Field`` annotations
* fields with valueless ``@Field`` annotations
* fields with ``@Field`` annotations with explicit values different from class field names

#####  2. Documents with embedded classes (one-to-one, one-to-many references):

* reference the subproperties in case of one-to-one relation
* reference the subproperties in case of one-to-many relation (collection element class fields)

#####  3. Hierarchies:

* Document class that has few superclasses (that are not documents themselves)
* Documents hierarchy: both parent and children are documents



[https://youtrack.jetbrains.com/issue/IDEA-308439](https://youtrack.jetbrains.com/issue/IDEA-308439)
[https://youtrack.jetbrains.com/issue/IDEA-308475](https://youtrack.jetbrains.com/issue/IDEA-308475)
[https://youtrack.jetbrains.com/issue/IDEA-308623](https://youtrack.jetbrains.com/issue/IDEA-308623)
[https://youtrack.jetbrains.com/issue/IDEA-308624](https://youtrack.jetbrains.com/issue/IDEA-308624)
[https://youtrack.jetbrains.com/issue/IDEA-308625](https://youtrack.jetbrains.com/issue/IDEA-308625)
[https://youtrack.jetbrains.com/issue/IDEA-308627](https://youtrack.jetbrains.com/issue/IDEA-308627)
[https://youtrack.jetbrains.com/issue/IDEA-308628](https://youtrack.jetbrains.com/issue/IDEA-308628)
[https://youtrack.jetbrains.com/issue/IDEA-308629](https://youtrack.jetbrains.com/issue/IDEA-308629)
[https://youtrack.jetbrains.com/issue/IDEA-308630](https://youtrack.jetbrains.com/issue/IDEA-308630)
[https://youtrack.jetbrains.com/issue/IDEA-308653](https://youtrack.jetbrains.com/issue/IDEA-308653)
[https://youtrack.jetbrains.com/issue/IDEA-308655](https://youtrack.jetbrains.com/issue/IDEA-308655)
[https://youtrack.jetbrains.com/issue/IDEA-308728](https://youtrack.jetbrains.com/issue/IDEA-308728)
