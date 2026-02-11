# TAGLINE

Manage ordered series of patches

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

**quilt** manages an ordered series of patches against a source tree, allowing patches to be applied, removed, and updated independently. It maintains a **series** file listing patches in order and a **patches/** directory containing the patch files, providing a structured workflow for maintaining modifications on top of upstream code.

The typical workflow involves creating a new patch with **new**, registering files to track with **add**, making changes, then saving the patch with **refresh**. Patches can be applied incrementally with **push** and removed with **pop**, and the entire series can be reordered or edited. Quilt is widely used in Linux distribution packaging to maintain downstream patches against upstream source.

# CAVEATS

Creates patches/ and series file. Standard patch format.

# HISTORY

Quilt was inspired by **Andrew Morton's** patch scripts for kernel development.

# SEE ALSO

[patch](/man/patch)(1), [diff](/man/diff)(1), [git](/man/git)(1)

