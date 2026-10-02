# TAGLINE

Forward Stripe webhook events to a local server

# TLDR

**Listen** for all snapshot events in the terminal

```stripe listen```

**Forward** events to a local webhook endpoint

```stripe listen --forward-to [localhost:3000/webhook]```

Forward **selected event types**

```stripe listen --events [payment_intent.succeeded,payment_intent.payment_failed] --forward-to [localhost:3000/webhook]```

Print events as **JSON**

```stripe listen --format [JSON]```

Print only the **webhook signing secret** and exit

```stripe listen --print-secret```

Forward **Connect** events to a second URL

```stripe listen --forward-to [localhost:3000/webhook] --forward-connect-to [localhost:3000/connect-webhook]```

Skip **TLS verification** when forwarding to HTTPS

```stripe listen --forward-to [https://localhost:3000/webhook] --skip-verify```

# SYNOPSIS

**stripe** **listen** [_options_]

# PARAMETERS

**-e**, **--events** _types_
> Comma-separated snapshot or thin event types to receive (e.g. `charge.captured`, `v1.billing.meter.no_meter_found`). Default is all snapshot events.

**--all-snapshot**
> Subscribe to every snapshot event.

**--all-thin**
> Subscribe to every thin event.

**--events-from** _source_
> Which accounts to receive events from: `@self` (your account), `@accounts` (connected accounts), or `all` (default).

**-f**, **--forward-to** _url_
> URL that received events are POSTed to.

**-c**, **--forward-connect-to** _url_
> URL for Connect events. Defaults to **--forward-to**.

**-H**, **--headers** _headers_
> Extra headers to send when forwarding, as `Key:Value` pairs.

**--connect-headers** _headers_
> Extra headers for Connect forwards, as `Key:Value` pairs.

**-l**, **--latest**
> Receive events formatted with the latest API version instead of the account default.

**--live**
> Receive live-mode events. Requires a live-mode login; check with **stripe whoami**.

**--format** _JSON_
> Print full event payloads as JSON. Prefer this over the deprecated **--print-json**.

**--print-secret**
> Print the webhook signing secret (`whsec_...`) and exit.

**-a**, **--use-configured-webhooks**
> Load endpoint configuration from the webhooks API / Dashboard instead of a local URL.

**--skip-verify**
> Skip TLS certificate verification when forwarding to HTTPS endpoints.

# DESCRIPTION

**stripe listen** is a subcommand of the **Stripe CLI**. It opens a direct connection to Stripe and streams webhook events to the terminal. With **--forward-to**, each event is also POSTed to a local HTTP endpoint so webhook handlers can be tested without a public URL or a tunnel.

On start the command prints a webhook signing secret. Use that value with Stripe's signature verification libraries. The secret is session-specific and changes each time **listen** is run.

**--events** accepts both snapshot types (`payment_intent.succeeded`) and thin types namespaced by API version (`v1.billing.meter.no_meter_found`). **--all-thin** and **--events-from @accounts** cover thin events and Connect accounts.

# CAVEATS

Requires **stripe login** (or **--api-key**). Events are delivered only while the process is running; events that fire while it is stopped are missed.

**--live** is required in live mode and rejected in a sandbox. Organization sandboxes are not supported.

The signing secret printed at start is not the same as a Dashboard endpoint secret. Update local verification when you restart **listen**.

**--print-json** is deprecated; use **--format JSON**. **--thin-events**, **--forward-thin-to**, and **--forward-thin-connect-to** still work but are deprecated in favor of **--events** / **--all-thin** and **--forward-to**.

# HISTORY

The **Stripe CLI** was released by **Stripe** in **2019**. **listen** was a primary reason for the CLI: local webhook testing without third-party tunnels.

# INSTALL

```brew: brew install stripe```

<!-- packages: 2026-10-02 -->

# SEE ALSO

[stripe](/man/stripe)(1), [stripe-logs](/man/stripe-logs)(1), [stripe-docs](/man/stripe-docs)(1)

# RESOURCES

```[Documentation](https://docs.stripe.com/cli/listen)```

```[Homepage](https://stripe.com)```

```[Source code](https://github.com/stripe/stripe-cli)```

<!-- verified: 2026-10-03 -->
