# TAGLINE

List XML element names and paths

# TLDR

**List element names**

```xml elements [file.xml]```

**List with paths**

```xml elements -a [file.xml]```

**List unique elements**

```xml elements -u [file.xml]```

# SYNOPSIS

**xml elements** [_options_] _file_

# PARAMETERS

**-a**
> Show XPath for each element.

**-u**
> Show unique elements only.

**-d** _depth_
> Maximum depth.

# DESCRIPTION

**xml elements** lists XML element names in a document. Part of xmlstarlet toolkit. Useful for exploring XML structure and discovering available element paths.

# INSTALL

```dnf: sudo dnf install xmlstarlet```

```pacman: sudo pacman -S xmlstarlet```

```apk: sudo apk add xmlstarlet```

```zypper: sudo zypper install xmlstarlet```

```brew: brew install xmlstarlet```

```nix: nix profile install nixpkgs#xmlstarlet```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[xml-select](/man/xml-select)(1), [xml-list](/man/xml-list)(1)

