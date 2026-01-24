# TLDR

**Authorize account**

```twurl authorize --consumer-key [key] --consumer-secret [secret]```

**GET request**

```twurl [/2/users/me]```

**POST request**

```twurl -X POST [/2/tweets] -d '{"text":"Hello"}'```

**List accounts**

```twurl accounts```

**Set default account**

```twurl set default [username]```

# SYNOPSIS

**twurl** [_-X method_] [_-d data_] [_options_] _endpoint_

# PARAMETERS

**-X** _METHOD_
> HTTP method.

**-d** _DATA_
> Request body.

**-H** _HEADER_
> Custom header.

**authorize**
> Set up OAuth.

**accounts**
> List accounts.

# DESCRIPTION

**twurl** is curl for Twitter. It handles OAuth.

Automatic authentication. No manual tokens.

Twitter API access. All endpoints.

Multiple accounts. Switch between them.

Request building. Headers and body.

# CAVEATS

Twitter API changes. Developer account needed. Ruby required.

# HISTORY

**twurl** was created by **Twitter** as an OAuth-enabled curl alternative for the Twitter API.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [twitter](/man/twitter)(1)
