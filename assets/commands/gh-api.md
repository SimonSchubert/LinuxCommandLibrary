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

**-f**, **--field** _key=value_
> Add string field.

**-F**, **--raw-field** _key=value_
> Add raw field.

**--input** _file_
> Read body from file.

**--jq** _query_
> Filter JSON output.

**--paginate**
> Paginate results.

**-H**, **--header** _header_
> Add HTTP header.

**-t**, **--template** _template_
> Format output with template.

# DESCRIPTION

**gh api** makes authenticated HTTP requests to the GitHub API. Supports both REST and GraphQL APIs with automatic authentication.

# SEE ALSO

[gh](/man/gh)(1), [curl](/man/curl)(1)

