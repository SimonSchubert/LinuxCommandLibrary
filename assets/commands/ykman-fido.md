# TAGLINE

Manage YubiKey FIDO2 credentials

# TLDR

**Show FIDO application information**

```ykman fido info```

**List resident credentials (passkeys)**

```ykman fido credentials list```

**Delete a resident credential**

```ykman fido credentials delete [id]```

**Set or change the FIDO PIN**

```ykman fido access change-pin```

**List registered fingerprints**

```ykman fido fingerprints list```

**Reset the FIDO application**

```ykman fido reset```

# SYNOPSIS

**ykman** **fido** _command_ [_options_]

# PARAMETERS

**info**
> Show FIDO2 application information.

**credentials list**
> List discoverable (resident) credentials.

**credentials delete** _id_
> Delete a resident credential.

**access change-pin**
> Set or change the FIDO PIN.

**access verify-pin**
> Verify the FIDO PIN against the YubiKey.

**fingerprints list**
> List registered fingerprints by ID and label.

**fingerprints add** _name_
> Add a new fingerprint (requires YubiKey Bio).

**fingerprints delete** _id_
> Delete a fingerprint by ID.

**fingerprints rename** _id_ _name_
> Set the label for a fingerprint.

**reset**
> Reset the FIDO application, removing all credentials and PIN.

# DESCRIPTION

**ykman fido** manages the FIDO2/WebAuthn application on a YubiKey. It allows viewing and managing passkeys (discoverable/resident credentials), configuring the FIDO PIN, and managing biometric fingerprints on YubiKey Bio series devices.

# CAVEATS

Reset permanently removes all FIDO credentials, the PIN, and fingerprints from the device. Fingerprint commands require a YubiKey with a fingerprint sensor and a FIDO PIN must be set first.

# SEE ALSO

[ykman](/man/ykman)(1), [ykman-oath](/man/ykman-oath)(1)

