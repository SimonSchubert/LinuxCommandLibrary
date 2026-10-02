# TAGLINE

Tail live Stripe API request logs

# TLDR

**Tail** all sandbox API request logs

```stripe logs tail```

Filter by **HTTP method**

```stripe logs tail --filter-http-method [GET]```

Filter by **request path**

```stripe logs tail --filter-request-path [/v1/customers]```

Filter by **status class**

```stripe logs tail --filter-status-code-type [4XX]```

Combine **method and error class**

```stripe logs tail --filter-http-method [POST] --filter-status-code-type [4XX]```

Accept **several values** for one filter

```stripe logs tail --filter-http-method [GET,POST]```

Print logs as **JSON**

```stripe logs tail --format [JSON]```

# SYNOPSIS

**stripe** **logs** **tail** [_options_]

# PARAMETERS

**tail**
> Stream API request logs in real time. This is the only **logs** subcommand.

**--filter-http-method** _GET_|_POST_|_DELETE_
> Keep requests with these HTTP methods. Repeat or comma-separate for several values.

**--filter-request-path** _path_
> Keep requests whose path matches a Stripe API path (e.g. `/v1/charges`).

**--filter-status-code** _code_
> Keep requests with this HTTP status code.

**--filter-status-code-type** _2XX_|_4XX_|_5XX_
> Keep requests whose status falls in that class.

**--filter-request-status** _SUCCEEDED_|_FAILED_
> **SUCCEEDED** is HTTP 200, 201, or 202. **FAILED** is 4xx and 5xx.

**--filter-source** _API_|_DASHBOARD_
> Keep requests that came from the Stripe API or from the Dashboard.

**--filter-ip-address** _address_
> Keep requests from this client IP.

**--filter-account** _connect_in_|_connect_out_|_self_
> Connect only: incoming Connect, outgoing Connect, or non-Connect (`self`) traffic.

**--format** _JSON_
> Print each log entry as JSON.

# DESCRIPTION

**stripe logs tail** is a subcommand of the **Stripe CLI**. It opens a direct connection to Stripe and prints API request logs from the current sandbox as they arrive, similar to the Logs view in the Dashboard.

Each default line includes a timestamp, status, method, path, and a request id that links to the Dashboard log. Combine filters; an entry is shown only when it matches every filter. A single filter may take several values as a comma-separated list.

Use **--format JSON** when piping into **jq** or other tools.

# CAVEATS

Requires **stripe login**. **stripe logs tail** works only in **sandboxes**. In live mode the command errors and tells you to **stripe switch** to a sandbox.

Logs appear only while the process is running. Historical logs are not replayed.

Filter values are validated: unknown HTTP methods, status classes, sources, or request-status tokens are rejected before the stream starts.

# HISTORY

The **Stripe CLI** was released by **Stripe** in **2019**. **logs tail** was added so developers can watch API traffic from the same terminal they use for **stripe listen** and resource commands.

# INSTALL

```brew: brew install stripe```

<!-- packages: 2026-10-02 -->

# SEE ALSO

[stripe](/man/stripe)(1), [stripe-listen](/man/stripe-listen)(1), [jq](/man/jq)(1)

# RESOURCES

```[Documentation](https://docs.stripe.com/cli/logs/tail)```

```[Homepage](https://stripe.com)```

```[Source code](https://github.com/stripe/stripe-cli)```

<!-- verified: 2026-10-03 -->
