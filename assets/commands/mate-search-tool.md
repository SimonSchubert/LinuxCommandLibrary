# TAGLINE

graphical file search utility for the MATE desktop environment

# TLDR

Search files containing a **specific string** in their name

```mate-search-tool --named=[string] --path=[path/to/directory]```

Search files **without waiting** for user confirmation

```mate-search-tool --start --named=[string] --path=[path/to/directory]```

Search files with name matching a **specific regex**

```mate-search-tool --start --regex=[string] --path=[path/to/directory]```

Set a **sorting order** in search results

```mate-search-tool --start --named=[string] --path=[path/to/directory] --sortby=[name|folder|size|type|date]```

Set a **descending sorting** order

```mate-search-tool --start --named=[string] --path=[path/to/directory] --descending```

Search files owned by a **specific user/group**

```mate-search-tool --start --user=[value] --path=[path/to/directory]```

# SYNOPSIS

**mate-search-tool** [_options_]

# PARAMETERS

**--named _string_**
> Search for files containing string in their name

**--regex _pattern_**
> Search for files matching the regular expression

**--path _directory_**
> Directory to search in

**--start**
> Begin search immediately without confirmation

**--sortby _field_**
> Sort results by: name, folder, size, type, or date

**--descending**
> Sort in descending order

**--user _name_**
> Search for files owned by specified user

**--group _name_**
> Search for files owned by specified group

# DESCRIPTION

**mate-search-tool** is a graphical file search utility for the MATE desktop environment. It provides an easy-to-use interface for locating files based on name patterns, content, ownership, modification time, and other criteria.

The tool can search recursively through directories and supports both simple wildcard matching and full regular expressions. Results are displayed in a sortable list with file details.

Command-line options allow pre-configuring search parameters, useful for creating desktop shortcuts or scripts that launch specific searches.

# CAVEATS

Searching large directory trees can be slow. The tool does not index files; each search scans the filesystem in real-time. For faster searches on large systems, consider using **locate** with an updated database.

# SEE ALSO

[find](/man/find)(1), [locate](/man/locate)(1), [catfish](/man/catfish)(1), [gnome-search-tool](/man/gnome-search-tool)(1)
