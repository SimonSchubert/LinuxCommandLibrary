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

**Coerce loose version**

```semver --coerce [v1.2]```

**Sort versions**

```semver [1.2.3] [1.0.0] [2.0.0]```

# SYNOPSIS

**semver** [_-i increment_] [_-r range_] [_options_] _version_

# PARAMETERS

**-i**, **--increment** _TYPE_
> Increment version.

**-r**, **--range** _RANGE_
> Test against range.

**--coerce**
> Coerce to valid version.

**-l**, **--loose**
> Loose parsing.

**--ltr**
> Less than range.

**--gtr**
> Greater than range.

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
