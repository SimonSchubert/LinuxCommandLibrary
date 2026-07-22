# TAGLINE

modify image metadata without rebuilding

# TLDR

**Add labels** to an image

```crane mutate [image] --label [key=value] -t [new:tag]```

**Set entrypoint**

```crane mutate [image] --entrypoint [/app/start] -t [new:tag]```

**Add environment variables**

```crane mutate [image] --env [KEY=value] -t [new:tag]```

# SYNOPSIS

**crane** **mutate** [_options_] _image_

# PARAMETERS

**-t**, **--tag** _tag_
> Tag for the mutated image.

**--label** _key=value_
> Add or override a label.

**--entrypoint** _cmd_
> Set the entrypoint.

**--cmd** _cmd_
> Set the command.

**--env** _key=value_
> Add environment variable.

**--user** _user_
> Set the user.

**--workdir** _dir_
> Set the working directory.

# DESCRIPTION

**crane mutate** modifies container image configuration without rebuilding. It can change labels, entrypoint, environment variables, and other metadata.

# INSTALL

```pacman: sudo pacman -S crane```

```apk: sudo apk add crane```

```zypper: sudo zypper install crane```

```brew: brew install crane```

```nix: nix profile install nixpkgs#crane```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[crane](/man/crane)(1), [crane-append](/man/crane-append)(1)

# RESOURCES

```[Source code](https://github.com/google/go-containerregistry)```

```[Documentation](https://github.com/google/go-containerregistry/blob/main/cmd/crane/doc/crane_mutate.md)```

<!-- verified: 2026-06-26 -->
