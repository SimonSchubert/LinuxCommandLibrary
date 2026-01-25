# TLDR

**Deduplicate dependencies**

```npm dedupe```

**Dry run (show what would change)**

```npm dedupe --dry-run```

**Include dev dependencies**

```npm dedupe --include=dev```

**Dedupe with legacy bundling**

```npm dedupe --legacy-bundling```

# SYNOPSIS

**npm dedupe** [_options_]

# PARAMETERS

**--dry-run**
> Show changes without applying.

**--include** _type_
> Include dependency type.

**--omit** _type_
> Omit dependency type.

**--legacy-bundling**
> Use legacy algorithm.

**--strict-peer-deps**
> Fail on peer dep issues.

# DESCRIPTION

**npm dedupe** reduces duplication in the package tree by moving dependencies higher in the tree where they can be shared. This can reduce node_modules size significantly.

The command restructures but doesn't change package-lock.json versions.

# EXAMPLE

```bash
# Before dedupe
node_modules/
├── a/
│   └── node_modules/lodash@4.0.0
└── b/
    └── node_modules/lodash@4.0.0

# After dedupe
node_modules/
├── a/
├── b/
└── lodash@4.0.0
```

# CAVEATS

May not reduce size if version ranges differ. Run after npm install. Restructures tree only.

# HISTORY

npm dedupe was introduced to help manage the duplicate dependency problem common in npm's nested node_modules structure.

# SEE ALSO

[npm](/man/npm)(1), [npm-prune](/man/npm-prune)(1), [npm-install](/man/npm-install)(1)
