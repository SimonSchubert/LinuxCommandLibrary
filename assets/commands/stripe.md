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

**stripe** manages Stripe payment integration from CLI. It simplifies development and testing.

Webhook listening receives events locally. Forwards production events to development server.

Event triggering tests integrations. Simulates various payment scenarios.

API access creates and manages resources. Customers, payments, subscriptions.

Log tailing shows real-time activity. Debug integration issues.

# CAVEATS

Requires Stripe account. Test mode for development. API keys sensitive.

# HISTORY

The **Stripe CLI** was released to improve developer experience. It enables local development and testing of Stripe integrations.

# SEE ALSO

[curl](/man/curl)(1)
