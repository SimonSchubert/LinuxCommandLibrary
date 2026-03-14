# TAGLINE

Manage TeX Live package repositories

# TLDR

**List repositories**

```tlmgr repository list```

**Add repository**

```tlmgr repository add [url] [tag]```

**Remove repository**

```tlmgr repository remove [url]```

**Set the entire repository list** (replaces all existing)

```tlmgr repository set [url#tag] [url#tag ...]```

**Check verification status** of repositories

```tlmgr repository status```

# SYNOPSIS

**tlmgr repository** _action_ [_options_]

# PARAMETERS

**list** [_path|url|tag_]
> List configured repositories and their tags. If a path, URL, or tag is given, initialize a TL database from that source and list its packages.

**list** **--with-platforms**
> Additionally list available platforms for each package.

**add** _path_ [_tag_]
> Add a repository, optionally attaching a tag for convenient reference.

**remove** _path|tag_
> Remove a repository by full path/URL or by its tag.

**set** _path_[**#**_tag_] [_path_[**#**_tag_] ...]
> Replace the entire repository list with the specified entries. One repository must be tagged as **main**.

**status**
> Report verification status of loaded repositories (tag, URL, and verification status).

# DESCRIPTION

**tlmgr repository** manages the list of TeX Live package repositories. It allows configuring CTAN mirrors and additional package sources. One repository must always be tagged as **main**; operations will fail without it. Part of TeX Live Manager.

# CAVEATS

The **set** action replaces all previously configured repositories. One repository must be tagged as **main** or operations will fail. Repository verification depends on a working GnuPG (gpg) binary being available.

# SEE ALSO

[tlmgr-update](/man/tlmgr-update)(1), [tlmgr](/man/tlmgr)(1), [tlmgr-conf](/man/tlmgr-conf)(1), [tlmgr-install](/man/tlmgr-install)(1)

