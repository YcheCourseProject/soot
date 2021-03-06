/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class ABreakpointStatement extends PStatement
{
    private TBreakpoint _breakpoint_;
    private TSemicolon _semicolon_;

    public ABreakpointStatement()
    {
        // Constructor
    }

    public ABreakpointStatement(
        @SuppressWarnings("hiding") TBreakpoint _breakpoint_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setBreakpoint(_breakpoint_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new ABreakpointStatement(
            cloneNode(this._breakpoint_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABreakpointStatement(this);
    }

    public TBreakpoint getBreakpoint()
    {
        return this._breakpoint_;
    }

    public void setBreakpoint(TBreakpoint node)
    {
        if(this._breakpoint_ != null)
        {
            this._breakpoint_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._breakpoint_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._breakpoint_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._breakpoint_ == child)
        {
            this._breakpoint_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._breakpoint_ == oldChild)
        {
            setBreakpoint((TBreakpoint) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
