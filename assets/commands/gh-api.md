# TAGLINE

authenticated HTTP requests to GitHub REST and GraphQL APIs

# TLDR

**Make GET request**

```gh api [/repos/owner/repo]```

**Make POST request**

```gh api -X POST [/repos/owner/repo/issues] -f title="[title]"```

**With JSON body**

```gh api [/endpoint] --input [data.json]```

**Use GraphQL**

```gh api graphql -f query='[query]'```

**Paginate results**

```gh api [/endpoint] --paginate```

**Output specific field**

```gh api [/repos/owner/repo] --jq '.[field]'```

# SYNOPSIS

**gh** **api** [_options_] _endpoint_

# PARAMETERS

**-X**, **--method** _method_
> HTTP method.

**-f**, **--raw-field** _key=value_
> Add a string parameter.

**-F**, **--field** _key=value_
> Add a typed parameter (non-string values, file references with @, booleans, null).

**--input** _file_
> Read body from file.

**--jq** _query_
> Filter JSON output.

**--paginate**
> Fetch all pages of results.

**--slurp**
> With --paginate, combine all pages into a single JSON array.

**-i**, **--include**
> Include HTTP response headers in the output.

**-p**, **--preview** _name_
> Opt into a GitHub API preview feature.

**-H**, **--header** _header_
> Add HTTP header.

**-t**, **--template** _template_
> Format output with a Go template.

**--hostname** _host_
> Make request against a specific GitHub hostname (for GHES).

**--cache** _duration_
> Cache the response (e.g., 1h, 30m).

# DESCRIPTION

**gh api** makes authenticated HTTP requests to the GitHub API. Supports both REST and GraphQL APIs with automatic authentication.

# SEE ALSO

[gh](/man/gh)(1), [curl](/man/curl)(1)

