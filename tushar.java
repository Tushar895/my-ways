const calculateAnswer = (email) => {
  // Split the email address into local part and domain
  const [localPart, domain] = email.split("@");
  
  // Split the domain into hostname and country codes
  const [hostname, ...countryCodes] = domain.split("-");
  
  // Calculate the answer as the product of the length of the local part,
  // the length of the hostname, and the sum of the lengths of the country codes
  return (localPart.length * hostname.length) + countryCodes.reduce((a, cc) => a + cc.length, 0);
}