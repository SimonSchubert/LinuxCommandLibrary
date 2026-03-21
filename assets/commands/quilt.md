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

**Show diff** of current changes

```quilt diff```

**Apply all patches** in the series

```quilt push -a```

**Remove all applied patches**

```quilt pop -a```

**Delete a patch** from the series

```quilt delete [patch_name.patch]```

# SYNOPSIS

**quilt** _command_ [_options_]

# PARAMETERS

**new** _NAME_
> Create a new patch with the given name and insert it after the current top patch.

**add** _FILE_
> Register a file to be tracked in the current topmost patch before making changes.

**push** [**-a**]
> Apply the next unapplied patch in the series. Use **-a** to apply all remaining patches.

**pop** [**-a**]
> Remove the topmost applied patch, reverting its changes. Use **-a** to remove all applied patches.

**refresh**
> Update the topmost patch to reflect the current changes to tracked files.

**series**
> List all patches in the series file in order.

**diff** [**-z**]
> Show the differences between the current state of tracked files and the topmost patch.

**delete** [**-r**] _NAME_
> Remove a patch from the series file. Use **-r** to also remove the patch file from the patches directory.

**edit** _FILE_
> Add a file to the topmost patch and open it in the default editor.

**top**
> Print the name of the topmost applied patch.

**applied**
> List all currently applied patches.

**unapplied**
> List all patches that have not yet been applied.

# DESCRIPTION

**quilt** manages an ordered series of patches against a source tree, allowing patches to be applied, removed, and updated independently. It maintains a **series** file listing patches in order and a **patches/** directory containing the patch files, providing a structured workflow for maintaining modifications on top of upstream code.

The typical workflow involves creating a new patch with **new**, registering files to track with **add**, making changes, then saving the patch with **refresh**. Patches can be applied incrementally with **push** and removed with **pop**, and the entire series can be reordered or edited. Quilt is widely used in Linux distribution packaging to maintain downstream patches against upstream source.

# CAVEATS

Quilt creates a **patches/** directory and a **series** file in the working directory. Files must be registered with **add** before editing, or changes will not be captured by **refresh**. The patches use standard unified diff format.

# HISTORY

Quilt was inspired by **Andrew Morton's** patch scripts for kernel development.

# SEE ALSO

[patch](/man/patch)(1), [diff](/man/diff)(1), [git](/man/git)(1)

