# TAGLINE

Import quilt patches to commits

# TLDR

**Import quilt patches**

```git quiltimport```

**Import from specific directory**

```git quiltimport --patches [patches/]```

**Dry run**

```git quiltimport -n```

# SYNOPSIS

**git quiltimport** [_options_]

# PARAMETERS

**--patches** _DIR_
> Patches directory.

**--series** _FILE_
> Series file location.

**-n**, **--dry-run**
> Show what would be imported.

**--author** _AUTHOR_
> Default author.

**--help**
> Display help information.

# DESCRIPTION

**git quiltimport** imports a quilt patchset into Git as a series of commits. Quilt is a patch management system, and this command reads the patches directory and series file, creating one commit per patch in order.

The command enables migration from quilt-based development workflows to Git, which was particularly common in Linux distribution packaging before Git became the standard.

# CAVEATS

Requires properly formatted quilt patches. Author info may need specification. One-way import.

# HISTORY

git quiltimport supports migration from **quilt**, a popular patch management tool used before git became widespread, particularly in Linux distribution development.

# SEE ALSO

[git-am](/man/git-am)(1), [quilt](/man/quilt)(1)
