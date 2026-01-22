# TLDR

**List** all available categories

```sudo chcat -L```

**Add** a category to a file

```sudo chcat +[CategoryName] [path/to/file]```

**Remove** a category from a file

```sudo chcat -- -[CategoryName] [path/to/file]```

**Set** specific categories for a file

```sudo chcat [CategoryName1,CategoryName2,...] [path/to/file]```

**Display** categories of a file

```ls -Z [path/to/file]```

**Remove all** categories from a file

```sudo chcat -d [path/to/file]```

# SYNOPSIS

**chcat** [_options_] _category_ _file_...

# DESCRIPTION

**chcat** changes SELinux security categories for files. Categories are part of Multi-Category Security (MCS), providing additional access control beyond traditional SELinux types.

MCS categories allow compartmentalization of data, where users or processes can only access files with matching categories.

# PARAMETERS

**-L, --list**
> List all available categories

**-d, --delete**
> Remove all categories from file

**+**_category_
> Add a category

**-**_category_
> Remove a category (use -- before)

# CAVEATS

Requires SELinux to be enabled with MCS policy. Category names must be defined in the policy. Changes affect access control immediately.

# SEE ALSO

[chcon](/man/chcon)(1), [semanage](/man/semanage)(8), [ls](/man/ls)(1)
