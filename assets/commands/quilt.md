# TLDR

**Create new patch**

```quilt new [patch_name.patch]```

**Add file to patch**

```quilt add [file]```

**Apply next patch**

```quilt push```

**Remove current patch**

```quilt pop```

**Refresh patch**

```quilt refresh```

**Show patch series**

```quilt series```

# SYNOPSIS

**quilt** _command_ [_options_]

# PARAMETERS

**new** _NAME_
> Create patch.

**add** _FILE_
> Add file to patch.

**push**
> Apply next patch.

**pop**
> Remove current patch.

**refresh**
> Update patch.

**series**
> Show patch list.

**diff**
> Show changes.

# DESCRIPTION

**quilt** manages patch series. Patch queue management.

The tool handles multiple patches. Used in packaging.

quilt manages patches.

# CAVEATS

Creates patches/ and series file. Standard patch format.

# HISTORY

Quilt was inspired by **Andrew Morton's** patch scripts for kernel development.

# SEE ALSO

[patch](/man/patch)(1), [diff](/man/diff)(1), [git](/man/git)(1)

