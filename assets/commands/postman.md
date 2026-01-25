# TLDR

**Launch Postman**

```postman```

**Run collection from CLI**

```newman run [collection.json]```

**Run with environment**

```newman run [collection.json] -e [environment.json]```

**Export results**

```newman run [collection.json] --reporters cli,json --reporter-json-export [results.json]```

# SYNOPSIS

**postman** [_options_]

**newman** run _collection_ [_options_]

# PARAMETERS (newman)

**-e**, **--environment** _file_
> Environment file.

**-g**, **--globals** _file_
> Global variables.

**-d**, **--iteration-data** _file_
> Data file for iterations.

**-n** _count_
> Iteration count.

**--reporters** _list_
> Output reporters.

**--timeout** _ms_
> Request timeout.

# DESCRIPTION

**Postman** is an API development platform with a GUI for designing, testing, and documenting APIs. **Newman** is its command-line companion for running collections in CI/CD.

# EXAMPLES

```bash
# Launch GUI
postman

# Run collection with Newman
newman run my-api-tests.json

# With environment
newman run collection.json -e staging.json

# Data-driven testing
newman run collection.json -d testdata.csv -n 10

# Multiple reporters
newman run collection.json --reporters cli,htmlextra
```

# COLLECTION FORMAT

Postman collections (JSON) contain:
- Requests with URLs, methods, headers
- Tests (JavaScript assertions)
- Variables and environments

# CAVEATS

Postman GUI requires account for cloud features. Newman runs locally without account. Free tier has limitations.

# HISTORY

Postman was founded by **Abhinav Asthana** in 2014, evolving from a Chrome extension to a full API platform.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [insomnia](/man/insomnia)(1)
