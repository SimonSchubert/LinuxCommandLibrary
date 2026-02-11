# TAGLINE

Edit XML documents from command line

# TLDR

**Update element value**

```xml edit -u "[//element]" -v "[new value]" [file.xml]```

**Insert element**

```xml edit -s "[//parent]" -t elem -n "[child]" -v "[value]" [file.xml]```

**Delete element**

```xml edit -d "[//element]" [file.xml]```

**Rename element**

```xml edit -r "[//old]" -v "[new]" [file.xml]```

# SYNOPSIS

**xml edit** [_options_] _file_

# PARAMETERS

**-u**, **--update** _xpath_
> Update matching nodes.

**-d**, **--delete** _xpath_
> Delete matching nodes.

**-s**, **--subnode** _xpath_
> Add subnode.

**-i**, **--insert** _xpath_
> Insert before.

**-a**, **--append** _xpath_
> Insert after.

**-r**, **--rename** _xpath_
> Rename nodes.

**-v**, **--value** _value_
> Value for operation.

**-t**, **--type** _type_
> Node type (elem, attr, text).

**-n**, **--name** _name_
> Node name.

**-L**, **--inplace**
> Edit file in place.

# DESCRIPTION

**xml edit** modifies XML documents from command line. Part of xmlstarlet toolkit. Supports inserting, updating, deleting, and renaming elements and attributes.

# SEE ALSO

[xml-select](/man/xml-select)(1), [xml-format](/man/xml-format)(1)

