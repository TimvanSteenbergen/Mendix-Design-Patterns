// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package designpattern_visitor.proxies;

public class TreeEdge
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject treeEdgeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DesignPattern_Visitor.TreeEdge";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Parent("DesignPattern_Visitor.Parent");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public TreeEdge(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DesignPattern_Visitor.TreeEdge"));
	}

	protected TreeEdge(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject treeEdgeMendixObject)
	{
		if (treeEdgeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DesignPattern_Visitor.TreeEdge", treeEdgeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DesignPattern_Visitor.TreeEdge");

		this.treeEdgeMendixObject = treeEdgeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TreeEdge.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static designpattern_visitor.proxies.TreeEdge initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return designpattern_visitor.proxies.TreeEdge.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static designpattern_visitor.proxies.TreeEdge initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new designpattern_visitor.proxies.TreeEdge(context, mendixObject);
	}

	public static designpattern_visitor.proxies.TreeEdge load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return designpattern_visitor.proxies.TreeEdge.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Parent
	 */
	public final designpattern_visitor.proxies.TreeNode getParent() throws com.mendix.core.CoreException
	{
		return getParent(getContext());
	}

	/**
	 * @param context
	 * @return value of Parent
	 */
	public final designpattern_visitor.proxies.TreeNode getParent(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		designpattern_visitor.proxies.TreeNode result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Parent.toString());
		if (identifier != null)
			result = designpattern_visitor.proxies.TreeNode.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Parent
	 * @param parent
	 */
	public final void setParent(designpattern_visitor.proxies.TreeNode parent)
	{
		setParent(getContext(), parent);
	}

	/**
	 * Set value of Parent
	 * @param context
	 * @param parent
	 */
	public final void setParent(com.mendix.systemwideinterfaces.core.IContext context, designpattern_visitor.proxies.TreeNode parent)
	{
		if (parent == null)
			getMendixObject().setValue(context, MemberNames.Parent.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Parent.toString(), parent.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return treeEdgeMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final designpattern_visitor.proxies.TreeEdge that = (designpattern_visitor.proxies.TreeEdge) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "DesignPattern_Visitor.TreeEdge";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
