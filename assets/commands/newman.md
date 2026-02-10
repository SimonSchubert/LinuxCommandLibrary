# TAGLINE

runs Postman collections from CLI

# TLDR

**Run Postman collection**

```newman run [collection.json]```

**Run with environment**

```newman run [collection.json] -e [environment.json]```

**Run specific folder**

```newman run [collection.json] --folder "[folder name]"```

**Export results**

```newman run [collection.json] -r [html] --reporter-html-export [report.html]```

**Run with iterations**

```newman run [collection.json] -n [10]```

**Run with data file**

```newman run [collection.json] -d [data.csv]```

**Set timeout**

```newman run [collection.json] --timeout-request [5000]```

# SYNOPSIS

**newman** **run** _collection_ [_options_]

# PARAMETERS

_COLLECTION_
> Postman collection file or URL.

**-e** _ENV_
> Environment file.

**--folder** _NAME_
> Run specific folder.

**-r** _REPORTERS_
> Reporter types.

**-n** _COUNT_
> Iteration count.

**-d** _FILE_
> Data file for iterations.

**--help**
> Display help information.

# DESCRIPTION

**newman** runs Postman collections from CLI. It automates API testing.

The tool executes request collections. Supports CI/CD integration.

# CAVEATS

Node.js based. Requires Postman collections. Export formats vary.

# HISTORY

Newman was created by **Postman** to enable command-line execution of API collections for testing automation.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [postman](/man/postman)(1)

