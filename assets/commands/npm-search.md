# TAGLINE

searches the npm registry for packages matching the given terms

# TLDR

**Search for packages**

```npm search [query]```

**Search with multiple terms**

```npm search [react] [router]```

**Output as JSON**

```npm search --json [query]```

**Limit results**

```npm search --searchlimit=[20] [query]```

**Long format output**

```npm search --long [query]```

# SYNOPSIS

**npm search** [_options_] [_terms_...]

# PARAMETERS

**--json**
> JSON output.

**--long**
> Extended information.

**--searchlimit** _n_
> Limit results.

**--searchopts** _opts_
> Search options.

**--searchexclude** _terms_
> Exclude terms.

**--registry** _url_
> Search specific registry.

# DESCRIPTION

**npm search** searches the npm registry for packages matching the given terms. It searches package names, descriptions, and keywords.

Results include package name, description, author, date, version, and keywords.

# EXAMPLE OUTPUT

```
NAME         DESCRIPTION                    AUTHOR    DATE
lodash       Lodash modular utilities       jdalton   2023-01
express      Fast web framework             dougwilson 2022-10
```

# ALTERNATIVES

```bash
# Use npms.io for better search
# Web: https://www.npmjs.com/search?q=query

# Use npm-search-cli
npms query
```

# CAVEATS

Registry search can be slow. Results may differ from website. Consider web interface for complex searches.

# HISTORY

npm search has been part of npm since early versions, providing command-line access to the npm registry search functionality.

# SEE ALSO

[npm](/man/npm)(1), [npm-view](/man/npm-view)(1), [npm-info](/man/npm-info)(1)
