# TAGLINE

uploads package to registry

# TLDR

**Publish package**

```npm publish```

**Publish with tag**

```npm publish --tag [beta]```

**Publish scoped public**

```npm publish --access public```

**Dry run**

```npm publish --dry-run```

**Publish specific folder**

```npm publish [./dist]```

**Publish with OTP**

```npm publish --otp=[123456]```

# SYNOPSIS

**npm** **publish** [_path_] [_options_]

# PARAMETERS

_PATH_
> Package folder to publish.

**--tag** _TAG_
> Distribution tag.

**--access** _LEVEL_
> public or restricted.

**--dry-run**
> Don't actually publish.

**--otp** _CODE_
> 2FA code.

**--help**
> Display help information.

# DESCRIPTION

**npm publish** uploads package to registry. Makes package available for installation.

The command publishes to npm. Requires authentication and unique version.

# CAVEATS

Requires npm account. Version must be unique. Can't unpublish easily.

# HISTORY

npm publish is the **primary mechanism** for sharing packages on the npm registry.

# SEE ALSO

[npm](/man/npm)(1), [npm-version](/man/npm-version)(1), [npm-unpublish](/man/npm-unpublish)(1)

