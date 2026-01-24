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

**semver** validates and manipulates semantic version strings. It follows semver.org specification.

Version incrementing bumps major, minor, or patch. Prerelease versions add suffix.

Range matching tests version satisfaction. NPM-style ranges supported.

Coercion handles non-standard versions. Converts 1.2 to 1.2.0.

Sorting orders versions correctly. Higher versions sort later.

# CAVEATS

Node.js package. Strict mode may reject valid-looking versions. Range syntax can be complex.

# HISTORY

**semver** is the Node.js implementation of semantic versioning. It's used by npm for package version resolution.

# SEE ALSO

[npm](/man/npm)(1), [node](/man/node)(1)
