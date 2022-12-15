## Tests for the document field referencing from the JSON queries

#####  1. Single-class documents:

* fields without ``@Field`` annotations
* fields with valueless ``@Field`` annotations
* fields with ``@Field`` annotations with explicit values different from class field names

#####  2. Documents with embedded classes (one-to-one, one-to-many references):

* reference the subproperties in case of one-to-one relation
* reference the subproperties in case of one-to-many relation (collection element class fields)

#####  3. Hierarchies:

* Document class that has few superclasses (that are not documents themselves)
* Documents hierarchy: both parent and childs are documents