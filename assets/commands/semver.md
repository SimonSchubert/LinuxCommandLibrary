# TAGLINE

Validate and manipulate semantic version strings

# TLDR

**Check if version is valid**

```semver [1.2.3]```

**Increment major version**

```semver -i major [1.2.3]```

**Increment minor version**

```semver -i minor [1.2.3]```

**Increment patch version**

```semver -i patch [1.2.3]```

**Compare versions**

```semver -r "[>=1.0.0 <2.0.0]" [1.5.0]```

**Coerce loose version string**

```semver -c [v1.2]```

**Increment prerelease with identifier**

```semver -i prerelease --preid [beta] [1.2.3]```

**Sort versions**

```semver [1.2.3] [1.0.0] [2.0.0]```

# SYNOPSIS

**semver** [_options_] _version_ [_version_ ...]

# PARAMETERS

**-i**, **--increment** _TYPE_
> Increment version by specified level. Default level is patch.

**-r**, **--range** _RANGE_
> Print versions that match the specified range.

**-c**, **--coerce**
> Coerce a string into a valid semver if possible.

**-l**, **--loose**
> Interpret versions and ranges loosely.

**-p**, **--include-prerelease**
> Always include prerelease versions in range matching.

**--preid** _IDENTIFIER_
> Identifier for prerelease version increments.

**-n** _BASE_
> Base number (0 or 1) for the prerelease identifier.

**--rtl**
> Coerce version strings right to left.

**--ltr**
> Coerce version strings left to right (default).

# INCREMENT TYPES

**major** - 1.2.3 -> 2.0.0
**minor** - 1.2.3 -> 1.3.0
**patch** - 1.2.3 -> 1.2.4
**premajor** - 1.2.3 -> 2.0.0-0
**preminor** - 1.2.3 -> 1.3.0-0
**prepatch** - 1.2.3 -> 1.2.4-0
**prerelease** - 1.2.3 -> 1.2.4-0

# DESCRIPTION

**semver** validates, compares, and manipulates semantic version strings following the semver.org specification. It provides version incrementing (bumping major, minor, patch, or prerelease components), range matching using NPM-style range syntax, and version sorting.

Range matching tests whether versions satisfy constraints like **>=1.0.0 <2.0.0**, **^1.2.3**, or **~1.2.3**, using the same range syntax as npm's package.json version specifiers. Coercion converts non-standard version strings like "v1.2" into valid semver format (1.2.0). Multiple versions passed as arguments are printed in sorted order.

# CAVEATS

Node.js package. Strict mode may reject valid-looking versions. Range syntax can be complex.

# HISTORY

**semver** is the Node.js implementation of semantic versioning. It's used by npm for package version resolution.

# SEE ALSO

[npm](/man/npm)(1), [node](/man/node)(1)
