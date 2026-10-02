# TAGLINE

Browse Stripe documentation from the terminal

# TLDR

Read a **docs page** by path

```stripe docs [/payments]```

Look up an **API resource**

```stripe docs api [product]```

Look up an API method by **HTTP verb and path**

```stripe docs api [GET /v1/products]```

Look up a **webhook event** in the API reference

```stripe docs api [product.created]```

**Search** the docs by keyword or phrase

```stripe docs search "[payment intents]"```

Print a page to **stdout** without a pager

```stripe docs --no-pager [/payments]```

# SYNOPSIS

**stripe** **docs** [_path_] [_options_]

**stripe** **docs** **api** _identifier_ [_options_]

**stripe** **docs** **search** _query_ [_options_]

**stripe** **docs** **prefs** **list** | **set** _id_ _value_ | **unset** _id_

# PARAMETERS

**path**
> Path or `docs.stripe.com` URL of a page to fetch, for example `/payments` or `/api/customers`. A leading `/` is added when missing.

**api** _identifier_
> Resolve Stripe API reference by resource name (`product`), HTTP method and path (`GET /v1/products`), or event type (`charge.succeeded`).

**search** _query_
> Search `docs.stripe.com`. Multiple arguments are joined into one query.

**prefs list**
> List documentation preferences and their allowed values (for example snippet language).

**prefs set** _id_ _value_
> Store a preference, e.g. `stripe docs prefs set server go`.

**prefs unset** _id_
> Drop a stored preference and revert to the default.

**--no-pager**
> Write rendered markdown to stdout instead of a pager. Default on when the CLI detects an AI agent.

**--non-interactive**
> Skip the interactive terminal browser and print the page. Default on when the CLI detects an AI agent.

# DESCRIPTION

**stripe docs** is a subcommand of the **Stripe CLI**. It fetches pages from `docs.stripe.com`, renders them as markdown in the terminal, and can search the site or jump into the API reference by resource, HTTP path, or webhook event name.

On a TTY it opens an interactive browser (Bubble Tea TUI) unless **--non-interactive** or **--no-pager** is set. Otherwise it pipes the rendered page through a pager. Full `https://docs.stripe.com/...` URLs are accepted and reduced to path, query, and fragment.

Authenticated requests reuse credentials from **stripe login**. Pages may be cached under the CLI config directory. Preferences such as code-snippet language are stored locally and applied when a page is rendered.

# CAVEATS

Requires the **stripe** binary. A network connection to Stripe is required to fetch and search pages.

**stripe docs api** fails with a not-found error when the locator cannot match the identifier. **stripe docs search** requires a query argument.

When stdout is not a terminal, or an AI agent is detected, the TUI is skipped and output is written for piping or capture.

# HISTORY

The **Stripe CLI** was released by **Stripe** in **2019**. The **docs** command was added later so developers and agents can read `docs.stripe.com` without leaving the terminal.

# INSTALL

```brew: brew install stripe```

<!-- packages: 2026-10-02 -->

# SEE ALSO

[stripe](/man/stripe)(1), [stripe-listen](/man/stripe-listen)(1), [stripe-logs](/man/stripe-logs)(1)

# RESOURCES

```[Documentation](https://docs.stripe.com/cli/docs)```

```[Homepage](https://stripe.com)```

```[Source code](https://github.com/stripe/stripe-cli)```

<!-- verified: 2026-10-03 -->
