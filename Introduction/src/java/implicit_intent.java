Intent smsIntent = new Intent(Intent.ACTION_VIEW);
smsIntent.setType("vnd.android-dir/mms-sms");
smsIntent.putExtra("sms_body", "Hello there! This is one way to send an sms.");
startActivity(Intent.createChooser(smsIntent, "Send an SMS");
