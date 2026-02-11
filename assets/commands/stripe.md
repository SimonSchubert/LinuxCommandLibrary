# TAGLINE

Stripe payment platform developer CLI

# TLDR

**Login to Stripe**

```stripe login```

**Listen for webhooks**

```stripe listen```

**Forward to local server**

```stripe listen --forward-to [localhost:3000/webhook]```

**Trigger test event**

```stripe trigger [payment_intent.succeeded]```

**List customers**

```stripe customers list```

**Create payment intent**

```stripe payment_intents create --amount [1000] --currency [usd]```

**View logs**

```stripe logs tail```

**Open dashboard**

```stripe open```

# SYNOPSIS

**stripe** _command_ [_subcommand_] [_options_]

# PARAMETERS

**login**
> Authenticate CLI.

**listen**
> Listen for webhooks.

**trigger** _EVENT_
> Trigger test event.

**logs tail**
> Stream logs.

**open**
> Open dashboard.

**--forward-to** _URL_
> Webhook destination.

**--api-key** _KEY_
> API key.

**-d**, **--data** _KEY=VALUE_
> Request data.

# DESCRIPTION

**stripe** is the official command-line interface for the Stripe payment platform, designed to streamline development and testing of payment integrations. It provides direct access to the Stripe API, allowing developers to create and manage resources like customers, payment intents, and subscriptions without writing code.

A key feature is webhook listening, which receives Stripe events locally and forwards them to a development server. This eliminates the need for public URLs during development. The trigger command simulates specific events like successful payments or failed charges, enabling thorough testing of webhook handlers.

The CLI also provides real-time log tailing for monitoring API requests and responses, and can open the Stripe dashboard directly. Authentication is handled through the login command, which manages API keys and supports both test and live modes.

# CAVEATS

Requires Stripe account. Test mode for development. API keys sensitive.

# HISTORY

The **Stripe CLI** was released to improve developer experience. It enables local development and testing of Stripe integrations.

# SEE ALSO

[curl](/man/curl)(1)
