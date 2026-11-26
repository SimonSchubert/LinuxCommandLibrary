# TAGLINE

Manage GitLab labels from the command line

# TLDR

**List** labels on the current repository

```glab label list```

List labels in another **repository**

```glab label list -R [owner/repository]```

List labels in a **group**

```glab label list -g [group]```

**Create** a label

```glab label create -n [name] -c [color] -d "[description]"```

**Rename** a label by its numeric id

```glab label edit -l [id] -n [new-name]```

**Delete** a label

```glab label delete [name]```

# SYNOPSIS

**glab label** _command_ [_flags_]

# PARAMETERS

**list**
> List labels. **ls** is an alias. **-R** selects a repository. **-g** selects a group instead of a project.

**create**
> Create a label. **-n** is the name. **-c** is a color name or a hex color (the default is a blue). **-d** is the description.

**edit**
> Change a label. **-l** is the numeric label id. **-n** sets a new name. **-d** sets the description.

**delete** _name_
> Delete the named label from the current repository.

**-h**, **--help**
> Show help and exit.

# DESCRIPTION

**glab label** creates, lists, edits, and deletes labels on a GitLab project or group. It is a subcommand of **glab**, not a separate program. With no repository flag, list, create, edit, and delete use the GitLab project that matches the git remote in the current directory.

Colors accept a name or a hex value. The numeric id that **edit** requires is the id GitLab shows for the label, not the title.

# INSTALL

```apt: sudo apt install glab```

```dnf: sudo dnf install glab```

```pacman: sudo pacman -S glab```

```apk: sudo apk add glab```

```zypper: sudo zypper install glab```

```brew: brew install glab```

```nix: nix profile install nixpkgs#glab```

<!-- packages: 2026-11-26 -->

# SEE ALSO

[glab](/man/glab)(1), [glab-issue](/man/glab-issue)(1), [glab-mr](/man/glab-mr)(1)

# RESOURCES

```[Source code](https://gitlab.com/gitlab-org/cli)```

```[Documentation](https://docs.gitlab.com/cli/label/)```

<!-- verified: 2026-11-26 -->
