# TLDR

**Deprecate package version**

```npm deprecate [package]@[version] "[message]"```

**Deprecate version range**

```npm deprecate [package]@"<[1.0.0]" "[message]"```

**Deprecate all versions**

```npm deprecate [package] "[message]"```

**Remove deprecation**

```npm deprecate [package]@[version] ""```

# SYNOPSIS

**npm deprecate** _pkg_@_version_ _message_

# PARAMETERS

**pkg@version**
> Package and version(s) to deprecate.

**message**
> Deprecation message (empty to remove).

# DESCRIPTION

**npm deprecate** marks a package version as deprecated on the npm registry. Users installing deprecated versions will see a warning message.

This is commonly used to discourage use of old or vulnerable versions while still allowing installation.

# EXAMPLES

```bash
# Deprecate specific version
npm deprecate my-package@1.0.0 "Critical bug, please upgrade"

# Deprecate old versions
npm deprecate my-package@"<2.0.0" "Version 1.x is no longer supported"

# Remove deprecation
npm deprecate my-package@1.0.0 ""
```

# USE CASES

```
- Security vulnerabilities
- Breaking changes
- Package renamed
- End of support
```

# CAVEATS

Requires publish access to package. Doesn't prevent installation. Empty message removes deprecation.

# HISTORY

npm deprecate was added to provide a softer alternative to unpublishing, allowing maintainers to warn users without breaking existing installations.

# SEE ALSO

[npm](/man/npm)(1), [npm-publish](/man/npm-publish)(1), [npm-unpublish](/man/npm-unpublish)(1)
